import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNext()) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0)break;
			boolean judge=false;
			for(int i=0;i<b-a;i++){
				int temp=a+i;
				if(temp%4==0&&temp%100!=0){
					out.println(temp);
					judge=true;
				}
				else if(temp%400==0){
					judge=true;
					out.println(temp);
				}
			}
			if(!judge)out.println("NA");
			out.println();
		}
		out.flush();
	}
}