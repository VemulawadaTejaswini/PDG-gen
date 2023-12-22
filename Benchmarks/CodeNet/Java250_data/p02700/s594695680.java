import java.math.*;
import java.util.*;


public class Main {

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int Th =scan.nextInt();
        int Ts=scan.nextInt();
        int Ah =scan.nextInt();
        int As=scan.nextInt();
        int i=0;
        while(Th>0 && Ah>0){
            
            if(i%2==0){
                Ah=Ah-Ts;
            }
            else if(i%2==1){
                Th=Th-As;
            }
           
            i++;
        }
        if(Ah<=0){
            System.out.print("Yes");
        }
        else if(Th<=0){
            System.out.println("No");
        }
    }

}
