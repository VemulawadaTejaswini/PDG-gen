import java.util.Scanner;

class Main {
    public static int GCD(int a, int b){
	if(a%b==0){
	    return b;
	}

	return GCD(b, a%b);
    }
     public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 
	 int gcd = GCD(a,b);

	 System.out.println(gcd);
     }

    
}

