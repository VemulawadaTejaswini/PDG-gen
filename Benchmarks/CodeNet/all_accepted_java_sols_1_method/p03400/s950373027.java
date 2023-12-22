import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();
		int X=sc.nextInt();

		int omanjyu=X;

		int[] nichi=new int[N];
		for(int i=0; i<N; i++) {
			nichi[i]=sc.nextInt();
		}

		for(int i=0; i<N; i++) {
			for(int j=1; j<=D; j++) {
				if((j-1)%nichi[i]==0) {
					omanjyu++;
				}
			}
		}
		System.out.println(omanjyu);
	}
}