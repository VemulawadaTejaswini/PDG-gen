import java.util.Scanner;

class Main{
    public static void main(String args[]){
	int a,b,c,d,e;
	Scanner in = new Scanner(System.in);
	a = in.nextInt();
	b = in.nextInt();
	c = in.nextInt();
	d = in.nextInt();
	e = in.nextInt();
	int ans = Math.min(a,Math.min(b,c)) + Math.min(d,e)-50;
	System.out.println(ans);
    }
}