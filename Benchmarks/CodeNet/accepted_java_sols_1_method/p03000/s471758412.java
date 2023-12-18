import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int n = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());

            int sum = 0;
            int count = 1;

            for(int i = 0; i < n; i ++){
                sum += Integer.parseInt(sc.next());
                if(sum <= x) count++;
                else break;
            }

            System.out.println(count);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
