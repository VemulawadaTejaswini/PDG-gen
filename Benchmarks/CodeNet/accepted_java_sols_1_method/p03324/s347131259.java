import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int multiplier = scan.nextInt();
        int numder = scan.nextInt();
        
        int minnumder = 0;
        
        if (multiplier != 0){
            minnumder = 100;
            for(int i = 1; i < multiplier ; i++){
                minnumder = minnumder * 100;
            }
        }else{
            minnumder = 1;
        }
        if(numder == 100){
            numder++;
        }
        
        int ans = minnumder * numder;
 
        System.out.println(ans);
    }
}