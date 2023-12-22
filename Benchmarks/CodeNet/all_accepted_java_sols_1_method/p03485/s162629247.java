import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double d=(Math.ceil((a+b)/2));
	
        System.out.print(String.format("%.0f", d));
		
    }
}