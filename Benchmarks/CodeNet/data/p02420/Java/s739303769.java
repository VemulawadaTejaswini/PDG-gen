import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static PrintWriter pr=new PrintWriter(System.out);
	public static void main(String[] args) {
	        while (true) {
	            String str1 = sc.next();
	            if(str1.equals("-"))break;
	            int temp = sc.nextInt();
	            for(int i=0;i<temp;i++) {
	                int h = sc.nextInt();
	                String str2=str1.substring(0, h),str3=str1.substring(h);
	                str1=str2+str3;
	            }
	            pr.println(str1);
	        }
	        pr.flush();
		
	}
}