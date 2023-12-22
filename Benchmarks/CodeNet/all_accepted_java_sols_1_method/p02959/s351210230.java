import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//勇者の人数
		int a[]= new int[n+1];
		int b[]= new int[n];
		
		for(int i=0;i<n+1;i++) {	//n+1の町にいるモンスター
		    a[i]=sc.nextInt();		//モンスターの数
		}
		
		for(int i=0;i<n;i++) {
		    b[i]=sc.nextInt();		//勇者が倒せる数
		}
		
		long count=0;
		for(int i=0;i<n;i++) {
		    if (b[i]<=a[i]) {
		        count+=b[i];
		    } else {
		        b[i]-=a[i];
		        count+=a[i];
		        
		        int ans= Math.min(a[i+1], b[i]);
		        count+=ans;
		        a[i+1]-=ans;
		    }
		}
		System.out.println(count);
		sc.close();
	}
}
