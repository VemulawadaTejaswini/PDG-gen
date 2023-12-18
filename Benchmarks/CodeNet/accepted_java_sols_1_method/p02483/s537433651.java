import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	int cp;
	for(int i=0;i<2;i++){
		if(a>b){
		cp=a;a=b;b=cp;
		}
		if(b>c){
		cp=b;b=c;c=cp;
		}
	}
	System.out.printf("%d %d %d\n",a,b,c);
	}
}