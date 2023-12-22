import java.util.Scanner;
class Main{
    public static void main(String[] args){
        String[] x = null;
        Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		x = ip.split(" ", 0);
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int c = Integer.parseInt(x[2]);
		int t = 0;

		if(a>b){
		    t=b;
		    b=a;
		    a=t;
		}
		if(b>c){
		    t=c;
		    c=b;
		    b=t;
		}
		if(a>b){
		    t=b;
		    b=a;
		    a=t;
		}
		System.out.println(a+" "+b+" "+c);
    }
}
