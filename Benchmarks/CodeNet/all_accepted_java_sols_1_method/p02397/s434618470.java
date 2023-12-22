import java.util.Scanner;
class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	while(true){
	    if(a==0 && b==0) break;
	    if(a<b) System.out.println(a+" "+b);
	    else System.out.println(b+" "+a);
	    a=sc.nextInt();
	    b=sc.nextInt();
	}
    }
}