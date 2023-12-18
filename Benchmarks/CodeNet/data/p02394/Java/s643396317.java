import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int W,H,x,y,r;
        
        Scanner scan = new Scanner(System.in);
        W = scan.nextInt();
        H = scan.nextInt();
        x = scan.nextInt();
        y = scan.nextInt();
        r = scan.nextInt();
        
        if(x > 0 && y > 0){
        if( x-r >= 0 && x+r <= W){
            if( y-r >= 0 && y+r <= H){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }else {System.out.println("No");
        }
        }else System.out.println("No");
    }
}
