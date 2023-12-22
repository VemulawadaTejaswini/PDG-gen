import java.util.Scanner;

public class Main{
       public static void main(String[] args){
       int i = 0;
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();
        
        int left = x - r;
        int right = x + r;
        int bottom = y - r;
        int up = y + r;
        
        if(left >= 0 && right <= W && bottom >= 0 && up <= H){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        
        
        
        } 
        
        
        
        
        
       }
}