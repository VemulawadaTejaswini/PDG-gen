import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            long catchNow = Long.parseLong(sc.next());
            long catchSpeed = Long.parseLong(sc.next());
            long helpNow = Long.parseLong(sc.next());
            long helpSpeed = Long.parseLong(sc.next());

            long time = Long.parseLong(sc.next());

            long distance = catchNow - helpNow;
            if(distance < 0) distance = distance * -1;

            long speedDiff = catchSpeed - helpSpeed;

            if(speedDiff <= 0) System.out.println("NO");
            else if(time >= distance/speedDiff){
                System.out.println("YES");                
            }else if(helpNow > Math.pow(10, 8) * 9.5){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}