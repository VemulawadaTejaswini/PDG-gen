import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			if("-".equals(s))break;
			int n = sc.nextInt();
			for(int i=0;i<n;i++ ){
				int  h = sc.nextInt();
				s = s.substring(h,s.length()) + s.substring(0, h);
			}
			System.out.println(s);
		}
		//.close();
	}

}