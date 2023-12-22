import java.util.Scanner;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	int m;
	if(a>=b){
	    m=a;a=b;b=m;
	}
	if(b>=c){
	    m=b;b=c;c=m;
	}
	if(a>=b){
	    m=a;a=b;b=m;
	}
	System.out.println(a+" "+b+" "+c);
    }
}