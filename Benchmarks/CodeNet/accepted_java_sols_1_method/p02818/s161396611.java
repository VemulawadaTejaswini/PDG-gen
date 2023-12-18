import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextLong();		//高橋
		long b=sc.nextLong();		//青木
		long k=sc.nextLong();		//繰り返し
		
		if(k<=a){
	          System.out.println(a-k+" "+ b);
	        }else if(k<=a+b){
	          System.out.println(0+" "+(b-(k-a)));
	        }else{
	          System.out.println(0+" "+0);
	        } 
		sc.close();
	}

}