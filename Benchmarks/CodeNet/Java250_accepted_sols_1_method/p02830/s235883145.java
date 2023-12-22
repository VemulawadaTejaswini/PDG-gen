import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String s=sc.next();
		String t=sc.next();
		char[] a =s.toCharArray();
	    char[] b =t.toCharArray();
	      
	      for(int i=0;i<n;i++){
	      System.out.print(a[i]+""+b[i]);
	      }
	}

}