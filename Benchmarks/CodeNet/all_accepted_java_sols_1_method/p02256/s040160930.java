import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int tmp = 0;
        while (true){
            if(a%b==0||b==1){
                System.out.println(b);
                break;
            }else{
                tmp = a;
                a = b;
                b = tmp%b;
            }
        }
    }
}