import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long y=x/11;
		long z=x%11;
		if(z==0)z=0;
		else if(z>6)z=2;
	    else z=1;
	    System.out.println(y*2+z);
		
		}
		
	}


