import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int one = 20*5+19*5;
        int three = one*2 + 20*10;
        int whole = three*333;
        
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
        	int y = sc.nextInt();
        	int m = sc.nextInt();
        	int d = sc.nextInt();
        	
        	int a = three*((y-1)/3) + one*((y-1)%3);
        	int b;
        	if(y%3 == 0) {
        		b = 20*(m-1);
        	}else {
        		b = 39*((m-1)/2) + 20*((m-1)%2);
        	}
        	int c = d-1;
        	
        	System.out.println(whole-(a+b+c));
        }
    }
}
