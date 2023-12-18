


import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] men=new int[4];

		for(int i=0; i<4; i++) {
			men[i]=sc.nextInt();
		}
		System.out.println(Math.max(men[0]*men[1], men[2]*men[3]));
	}
}