import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		int len = 0;
		int point =0;
		String a ="";
		String b ="";
		while(!str.equals("-")){
			int m = scan.nextInt();
			len =str.length();
			for(int i=0;i<m;i++){
				point = scan.nextInt();
				a=str.substring(0,point++);
				b=str.substring(point-1);
				str=b+a;
			}
			System.out.println(str);
			str=scan.next();
		}
	}

}