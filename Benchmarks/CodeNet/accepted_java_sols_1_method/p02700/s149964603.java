import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int A1=scan.nextInt();
        int A2=scan.nextInt();
        int B1=scan.nextInt();
        int B2=scan.nextInt();
        while(true){
            B1=B1-A2;
            if(B1<=0){
                System.out.println("Yes");
                break;
            }
            A1=A1-B2;
            if(A1<=0){
                System.out.println("No");
                break;
            }
        }
        
    }
}
