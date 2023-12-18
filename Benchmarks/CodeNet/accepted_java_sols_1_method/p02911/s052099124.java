import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int q=sc.nextInt();
		int tokuten[]=new int[n];
		for(int i=0;i<n;i++) {
			tokuten[i]=k-q;
		}
		for(int i=0;i<q;i++) {
			int h=sc.nextInt();
			tokuten[h-1]++;
		}

		for(int i=0;i<n;i++) {
			if(tokuten[i]>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}