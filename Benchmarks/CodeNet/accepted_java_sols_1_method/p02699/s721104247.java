import java.util.*;

class Main{
    public static void main(final String[] args){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int w = scan.nextInt();
        
        if(s <= w){
            System.out.println("unsafe");
        }else{
            System.out.print("safe");
        }
    }    
}