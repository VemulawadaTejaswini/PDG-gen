import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//n個の整数
		
		for(int i=0;i<n;i++) {		//n個回す
			int a=sc.nextInt();
		    if(a%2==0&&a%3!=0&&a%5!=0){
			      System.out.println("DENIED");
			        return;
		    }
		}
		  System.out.println("APPROVED");

		sc.close();
	}
	
}