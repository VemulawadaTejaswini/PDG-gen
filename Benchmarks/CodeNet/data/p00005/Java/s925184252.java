import java.util.Scanner;

class Main{

    static int gcd(int a,int b){
	if(b==0) return a;
	else return gcd(b,a%b);
    }
    
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int g=gcd(a,b);
	    System.out.println(g + " " + (a*b/g));
	}
    }
}