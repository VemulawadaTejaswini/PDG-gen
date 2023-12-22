import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int min=1145141919;
	int E=0;
	for(int i=0;i<a;i++) {
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(min>c) {
			min=c;
			E=b;
		}
	}
	System.out.println(E+min);
	}
}