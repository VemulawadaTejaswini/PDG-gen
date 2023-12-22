import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        while(n%7!=0){
            n-=4;
            if(n<4&&n!=0){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
