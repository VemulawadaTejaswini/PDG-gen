import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//読み込み
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			//格納 
			a[i] = sc.nextInt();
		 
			for(int i=0;i<n;i++){
			//正順
			//System.out.print(" aは"+a[i]);
			//間の空白
			if(i!=0)System.out.print(" ");
			//逆順
			System.out.print(a[n-i-1]);
		}
			
		System.out.println("");
	}

}
