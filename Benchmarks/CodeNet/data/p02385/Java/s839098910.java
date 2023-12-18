import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static double minkDist(int[] a, int[] b, int n, int p){
		double result = 0;

		double max = 0;
		for(int i = 0; i < n; i++){
			result += Math.pow(Math.abs(a[i] - b[i]), p);

			if(max < Math.abs(a[i] - b[i])){
				max = Math.abs(a[i] - b[i]);
			}
		}

		if(p == Integer.MAX_VALUE){
			return max;
		}
		else {
			return Math.pow(result, 1.0/p);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


//		String str = br.readLine();

//		while(true){
//		int n = Integer.parseInt(br.readLine());

		int[] a = new int[6];
		int[] b = new int[6];
//		int[] b = new int[n];

		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < 6; i++){
			a[i] = Integer.parseInt(tmpArray[i]);
		}

		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < 6; i++){
			b[i] = Integer.parseInt(tmpArray[i]);
		}



//		int n = Integer.parseInt(br.readLine());

//		String str = br.readLine();
//
//		for(int i = 0; i < n ; i++){
		Dice dice = new Dice(a);
		Dice dice2 = new Dice(b);
		//tmpArray = br.readLine().split(" ");

//		int top = Integer.parseInt(tmpArray[0]);
//		int front = Integer.parseInt(tmpArray[1]);

		int indexT = dice2.indexOf(dice.top());
		
		if(indexT == -1){
			System.out.println("No");
			//System.out.println("top error");
			return;
		}
		//System.out.println("t "+indexT);

		//???????????????????????????
		int result = -1;
		if(indexT == 1){
			dice2.move("North");
		}
		else if(indexT == 2){
			dice2.move("West");
		}
		else if(indexT == 3){
			dice2.move("South");
		}
		else if(indexT == 4){
			dice2.move("East");
		}
		else if(indexT == 5){
			dice2.move("North"); dice2.move("North");
		}

		int indexF = dice2.indexOf(dice.number(1));
		if(indexF == -1 || indexF == 5){
			System.out.println("No");
			//System.out.println("front error");
			return;
		}
		//System.out.println("f "+indexF);

		//?¬???????????????????
		if(indexF == 2){
			dice2.move("Left");
		}
		else if(indexF == 4){
			dice2.move("Right");
		}
		else if(indexF == 3){
			dice2.move("Left");
			dice2.move("Left");
		}

		for(int i = 2; i < 6; i++){
			if(dice2.indexOf(dice.number(i)) != i){
				System.out.println("No");
				//System.out.println("face "+i+" is different d1 is "+dice.number(i)+" d2 is "+dice2.number(i));
				return;
			}
		}
		System.out.println("Yes");

//		System.out.println(dice.top());
//
//			if(n == 0){
//				break;
//			}
//			String[] tmpArray = br.readLine().split(" ");
//			int[] input = new int[n];
//			int sum = 0;
//			for(int i = 0; i < n ; i++){
//				input[i] = Integer.parseInt(tmpArray[i]);
//				sum += input[i];
//			}
//			double ave = (double)sum / n;
//
//			double var = 0;
//			for(int i = 0; i < n ; i++){
//				var += Math.pow((input[i] - ave) , 2)/n;
//			}
//
//			System.out.println(Math.pow(var, 0.5));
//		}
//		System.out.println(p1.distance(p2));


//		System.out.println(count);

//
//			if(Character.isLowerCase(c)){
//				System.out.print(Character.toUpperCase(c));
//			}
//
//			else if(Character.isUpperCase(c)){
//				System.out.print(Character.toLowerCase(c));
//			}
//			else {
//				System.out.print(c);
//			}
//		}
//		System.out.println();

//		String[] tmpArray = br.readLine().split(" ");
//		int n = Integer.parseInt(tmpArray[0]);
//		int m = Integer.parseInt(tmpArray[1]);
//		int l = Integer.parseInt(tmpArray[2]);
//
//		long[][] a = new long[n][m];
//		long[][] b = new long[m][l];
//		long[][] c = new long[n][l];
//
//		for(int i = 0; i < n; i ++){
//			tmpArray = br.readLine().split(" ");
//			for(int j = 0; j < m; j++){
//				a[i][j] = Long.parseLong(tmpArray[j]);
//			}
//		}
//
//		for(int i = 0; i < m; i ++){
//			tmpArray = br.readLine().split(" ");
//			for(int j = 0; j < l; j++){
//				b[i][j] = Integer.parseInt(tmpArray[j]);
//			}
//		}
//
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < l; j++){
//				for(int k = 0; k < m; k++){
//					c[i][j] += a[i][k]*b[k][j];
//				}
//
//				if(j != 0 ){
//					System.out.print(" ");
//				}
//				System.out.print(c[i][j]);
//			}
//			System.out.println();
//		}


	}

}

class Dice {
    //??????????????????????\\??????????????????
    private int[] numbers = new int[6];// = {1,2,3,5,4,6};
    private int sum = 1;

    public Dice(int[] numbers){
    	for(int i = 0; i < 6; i++){
    		this.numbers[i] = numbers[i];
    	}
    	this.numbers[3] = numbers[4];
    	this.numbers[4] = numbers[3];
    }

    public void move (String command){
        if(command.equals("North")) {
            north();
        }

        else if(command.equals("South")) {
            south();
        }
        else if(command.equals("East")) {
            east();
        }
        else if(command.equals("West")) {
            west();
        }
        else if(command.equals("Right")) {
            right();
        }
        else if(command.equals("Left")) {
            left();
        }

        sum += numbers[0];
    }

    public int getSum(){
        return sum;
    }

    private void north () {
        int[] tmp = numbers.clone();
        numbers[0] = tmp[1];
        numbers[1] = tmp[5];
        numbers[3] = tmp[0];
        numbers[5] = tmp[3];
    }

    private void east () {
        int[] tmp = numbers.clone();
        numbers[0] = tmp[4];
        numbers[2] = tmp[0];
        numbers[4] = tmp[5];
        numbers[5] = tmp[2];
    }

    private void west () {
        east(); east(); east();
    }

    private void south () {
        north(); north(); north();
    }

    private void right () {
        int[] tmp = numbers.clone();
        numbers[1] = tmp[2];
        numbers[2] = tmp[3];
        numbers[3] = tmp[4];
        numbers[4] = tmp[1];
    }

    private void left () {
        right(); right(); right();
    }

    public int top(){
    	return numbers[0];
    }

    public int indexOf(int num){
    	for(int i = 0; i < 6; i++){
    		if(numbers[i] == num){
    			return i;
    		}
    	}

    	return -1;
    }

    public int number(int index){
    	return numbers[index];
    }
}