import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int intN = sc.nextInt();
        long ans =1;

        for(int i=0; i<intN; i++){
            //各桁の和を求める
            ans *= sc.nextLong();
            
        }
        if(ans >= Math.pow(10,18)){
            ans = -1;
        }
        System.out.println(ans);
    }
}