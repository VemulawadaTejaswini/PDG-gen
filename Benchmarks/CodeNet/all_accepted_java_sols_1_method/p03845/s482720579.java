import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//コンテストドリンク
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int t[] =new int[n];
		for(int i=0;i<n;i++){
			t[i]=sc.nextInt();
			sum+=t[i];
		}
		int m=sc.nextInt();
		System.out.println();
		for(int i=0;i<m;i++){
			System.out.println(sum-t[sc.nextInt()-1]+sc.nextInt());
		}
	}

}
