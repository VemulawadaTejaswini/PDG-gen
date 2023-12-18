import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		int  b;
		int i=0;
		while(scan.hasNext()){
			a=Integer.toString(scan.nextInt()).length();
			b=Integer.toString(scan.nextInt()).length();
			System.out.println(a+b);
			i++;
			if(i>200){
				break;
			}
		}
	}
}