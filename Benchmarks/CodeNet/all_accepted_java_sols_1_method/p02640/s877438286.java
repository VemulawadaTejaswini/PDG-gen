import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x,y,asi;
        x=scan.nextInt();
        y=scan.nextInt();
        
       for(int c=0; c<=x; c++){
           if(c*2+(x-c)*4==y){
               System.out.println("Yes");
               System.exit(0);
           }
       }
        System.out.println("No");
    }
}
