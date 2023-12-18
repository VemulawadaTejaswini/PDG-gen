import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] N = new int[5];
		for(int i=0;i<5;i++) {
			N[i] = scan.nextInt();
			if(N[i]==0) {
				System.out.println(i+1);
			}
		}
		scan.close();
	}

}