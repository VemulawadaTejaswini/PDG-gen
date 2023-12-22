import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String a = sc.next();
			if(a.equals("0"))break;
			int b,sum=0;
			for(int i=0;i<a.length();i++){
				b = a.charAt(i) - '0';
				sum += b;
			}
			System.out.println(sum);
		}
	}
}

