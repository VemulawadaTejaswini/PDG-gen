import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int weight;
		int[] num = new int[10];

		while(sc.hasNext()){
			weight = sc.nextInt();

			for(int i = 0; i < 10; i++){
				num[9 - i] = weight / (int)Math.pow(2, 9 - i);
				if(num[9 - i] == 1){
					weight %= (int)Math.pow(2, 9 - i);
				}
			}

			boolean fnum = true;
			for(int i = 0; i < 10; i++){
				if(num[i] == 1){
					if(fnum ==true){
						System.out.print((int)Math.pow(2, i));
						fnum = false;
					}else{
						System.out.print(" " + (int)Math.pow(2, i));
					}
				}
			}
			System.out.println();
		}
	}
}