import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		final Scanner sc=new Scanner(System.in);
		int A=0;
		int B=0;
		int count=0;
		while(true){
			int n=sc.nextInt();
			if (n==0) break;
			count++;
			A=0;
			B=0;
			for(int i=0;i<n;i++){
				int Lcard=sc.nextInt();
				int Rcard=sc.nextInt();
				if(Lcard<Rcard&&count%2==1||Lcard>Rcard&&count%2==0) B+=Lcard+Rcard;
				else if(Lcard==Rcard) {
					A+=Lcard;
					B+=Rcard;
				
				}
				else A+=Lcard+Rcard;

			}
			if(count%2==1) System.out.println(A+" "+B);
			else System.out.println(B+" "+A);
		}
		sc.close();
	}
}