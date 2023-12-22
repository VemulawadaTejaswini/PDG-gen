import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            String s = sc.next();
            long k = Long.parseLong(sc.next());

            int loopOne = 0;
            String notOne = "";

            for(int i = 0; i < s.length(); i++){
                String subS = s.substring(i, i + 1);
                if(!subS.equals("1")){
                    notOne = subS;
                    break;
                }
                loopOne++;
            }

            if(k <= loopOne) System.out.println(1);
            else System.out.println(notOne);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}