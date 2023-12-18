import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){

			int cnt = 0;
			int n = sc.nextInt();
			if(n == 0)break;
			int array[] = new int[n];
			for (int i = 0; i < array.length; i++){
				array[i] = sc.nextInt();
			}
			boolean change;
			do{
				change = false;
				cnt++;
				int temp[] = new int [array.length];
				int count [] = new int[13];
				for(int i = 0; i < array.length; i++){
					count[array[i]]++;
				}
				for(int i  = 0; i < temp.length; i++){
					temp[i] = count[array[i]];
				}
				for(int i = 0; i < array.length; i++){
					change =  array[i] == temp[i];
				}
				//change = Arrays.equals(array,temp);
				array = temp;

			}while(!change);

			System.out.println(cnt);
			for(int i = 0; i < array.length - 1; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println(array[array.length - 1]);
		}

	}
}

