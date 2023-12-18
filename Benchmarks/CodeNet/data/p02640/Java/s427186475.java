import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int X = sn.nextInt();
        int Y = sn.nextInt();
        
        for(int i=0; i<X; i++){
            if(4*i + 2*(X-i) == Y){
                System.out.println("Yes");
                break;
            }
            if(i == X-1) System.out.println("No");
        }
    }
}