import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(scan.hasNext()){
        	int x = scan.nextInt();
        	int h = scan.nextInt();
        	if(x == 0 && h == 0){
        		break;
        	}
        	System.out.printf("%.6f\n",(double)x*x + (double)x*Math.sqrt(4*h*h+x*x));
        }
    }
}