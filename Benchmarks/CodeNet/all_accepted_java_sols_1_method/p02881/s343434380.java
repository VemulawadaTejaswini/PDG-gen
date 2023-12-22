import java.util.Scanner;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	long x = 0, y = 0;
		long n = sc.nextLong();
      	for (long i = 1; i*i <= n; i++) { 
          if (n%i == 0) {
             x = i;     
             y = n/i;
          }
        }      
        System.out.println(x+y-2); 
	}
}