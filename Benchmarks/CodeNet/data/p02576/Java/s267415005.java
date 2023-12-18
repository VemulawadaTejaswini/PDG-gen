import java.util.Scanner;

public  class test01{
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int n = stdIn.nextInt();
	int x = stdIn.nextInt();
	int t = stdIn.nextInt();
	if(n%x == 0){
	System.out.println(n/x*t);
}
else {System.out.println((n/x+1)*t);}
}
}