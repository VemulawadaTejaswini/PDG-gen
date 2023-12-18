import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		int cost1=0;
		int cost2=0;
		int anumber = N/A;
		int bnumber = N/C;
		int cost;
		if(N%A==0) {
			cost1+=B*anumber;
		}
		else {
			cost1+=B*(anumber+1);
		}
		if(N%C==0) {
			cost2+=D*bnumber;
		}
		else {
			cost2+=D*(bnumber+1);
		}
		if(cost1>cost2) {
			cost=cost2;
		}
		else {
			cost=cost1;
		}
		System.out.println(cost);
		

	}
}

