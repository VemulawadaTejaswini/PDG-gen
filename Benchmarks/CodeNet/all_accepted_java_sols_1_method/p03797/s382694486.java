import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
long a=scan.nextLong();
long b=scan.nextLong();
long i=0;
long s=0;
if(2*a>=b) {i=b/2;}
else if(2*a<b) {i=a;s=b-2*a;i+=s/4;}
System.out.println(i);
}
}