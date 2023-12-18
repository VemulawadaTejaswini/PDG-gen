import java.util.Scanner;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	String Ans;
	if(a<=b)
	    if(a<=c)
		if(b<=c)Ans=a+" "+b+" "+c;
		else Ans=a+" "+c+" "+b;
	    else Ans=c+" "+a+" "+b;
	else if(b<=c)
	    if(a<=c)Ans=b+" "+a+" "+c;
	    else Ans=b+" "+c+" "+a;
	else Ans=c+" "+b+" "+a;
	System.out.println(Ans);
    }
}