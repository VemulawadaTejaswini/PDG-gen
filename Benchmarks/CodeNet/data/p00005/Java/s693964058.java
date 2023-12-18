import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNextInt()){
    		int a = input.nextInt();
    		int b = input.nextInt();
    		int gcd_num = gcd(a,b);
    		System.out.println(gcd_num+" "+(a/gcd_num)*b);
    	}
    }
    
    public static int gcd(int x,int y){
    	int r;
        while((r = x % y) != 0) // yで割り切れるまでループ
        {
            x = y;
            y = r;
        }
        return y;
    }
}