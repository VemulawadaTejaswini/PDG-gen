import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        
        int i,x=0;
        for(i = l;i <= r;i++){
            if(i % d == 0){
                x++;
            }
        }
        System.out.println(x);

        
    }
}