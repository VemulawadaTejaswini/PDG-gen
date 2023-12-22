import java.util.Scanner;
public class Main{
	
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
		String a=scan.next();
		int count0=0;
		int count1=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='0') {
				count0++;
			}
			else {
				count1++;
			}
		}
		System.out.println(count1>count0?count0*2:count1*2);
	}
}