import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int W,H,x,y,r;
        W=scan.nextInt();
        H=scan.nextInt();
        x=scan.nextInt();
        y=scan.nextInt();
        r=scan.nextInt();
        if(x-r>=0 && y-r>=0 && x+r<=W && y+r<=H){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
    }
}