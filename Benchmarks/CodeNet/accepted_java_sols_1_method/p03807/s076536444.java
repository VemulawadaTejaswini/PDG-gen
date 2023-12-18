import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] kazu=new int[N];
		int odd=0;
		int even=0;
		for(int i=0; i<N; i++) {
			kazu[i]=sc.nextInt();
			if(kazu[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		if(odd%2==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}