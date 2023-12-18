import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        //N円の税抜き価格X円を知りたい！！
        //値段
        int n = sc.nextInt();
        
        //税抜き価格
        double x = 1.0;
        
        while(true){
            if((int)(x * 1.08) == n){
                System.out.println((int)x);
                break;
            }
            x++;
            
            if(x > n){
                System.out.println(":(");
                break;
            }
        }
    }
}
