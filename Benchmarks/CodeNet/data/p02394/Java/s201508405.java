import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int W =sc.nextInt();
        int H =sc.nextInt();
        int x =sc.nextInt();
        int y =sc.nextInt();
        int r =sc.nextInt();
        if(W>=r+x && H>=r+y && x>0 && y>0){
        System.out.println("Yes");
        }else{
        System.out.println("No");  
        }
    }
}
        
        
