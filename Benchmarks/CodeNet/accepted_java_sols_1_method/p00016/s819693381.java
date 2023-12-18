import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double x = 0;
        double y = 0;
        int arg = 90;
        while(true){
        	String[] st = input.nextLine().split(",");
        	int rx = Integer.parseInt(st[0]);
        	int a = Integer.parseInt(st[1]);
        	if(rx == 0 && a == 0)break;
        	y += rx*Math.sin(Math.toRadians(arg));
        	x += rx*Math.cos(Math.toRadians(arg));
        	arg -= a;
        }
        System.out.println((int)x);
        System.out.println((int)y);
    }    
}