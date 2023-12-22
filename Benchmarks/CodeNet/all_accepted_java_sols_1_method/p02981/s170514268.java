import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int pNum = sc.nextInt();
        int trainm = sc.nextInt();
        int carm = sc.nextInt();
        int trSum = pNum * trainm;
        if(trSum < carm){
            //電車の代金を出力
            out.println(trSum);
        } else {
            //同じ場合も入っている
            out.println(carm);
        }
        
    }
}