import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());

            long ans = 1;
            boolean cannot = false;

            for(int i = 0; i < n; i++){
                long a = Long.parseLong(sc.next());
                

                long ansCalc = ans;
                long aCalc = a;
                int digitA = 0;
                int digitAns = 0;

                while(ansCalc > 0){
                    ansCalc /= 10;
                    digitAns++;
                }

                while(aCalc > 0){
                    aCalc /= 10;
                    digitA++;
                }

                if(digitA + digitAns >= 18){
                    cannot = true;
                    break;
                }

                ans *= a;
            }

            if(cannot) System.out.println(-1);
            else System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}