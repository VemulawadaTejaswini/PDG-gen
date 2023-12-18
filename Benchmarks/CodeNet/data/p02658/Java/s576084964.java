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
                ans *= a;
                if(ans > (long)Math.pow(10, 18)){
                    cannot = true;
                    break;
                }
            }

            if(cannot) System.out.println(-1);
            else System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}