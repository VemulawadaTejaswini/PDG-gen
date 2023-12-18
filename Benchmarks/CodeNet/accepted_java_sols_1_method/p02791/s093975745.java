import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int count = 0;
		 int P[] = new int[N];
		 int Pj = 0;
		 for(int i=0; i<N; i++) {
			P[i]= sc.nextInt();
			Pj = P[0];
		 }
		 for(int i=0; i<N; i++) {
			if(P[i]<=Pj) {
				count++;
				Pj = P[i];
				}
		 }
		 System.out.println(count);
    }
}