import java.util.Scanner;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[] __){
		long a=getInt(),b=getInt(),c=getInt(),s=0,buf;
		for(int i=0;i<114514;i++) {
			if(s-(buf=s/60*60)<=c&&c<=s+a-buf) {
				System.out.println(buf+c);
				return;
			}
			s+=a+b;
		}
		System.out.println(-1);
	}
}