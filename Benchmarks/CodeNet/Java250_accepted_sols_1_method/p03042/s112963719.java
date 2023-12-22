import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S=sc.nextInt();
        if(S/100>12||S/100==0){
            if(S%100<=12&&S%100>0){
                System.out.println("YYMM");
            }
            else{
                System.out.println("NA");
            }
        }
        else{
            if(S%100<=12&&S%100>0){
                System.out.println("AMBIGUOUS");
            }
            else{
                System.out.println("MMYY");
            }
        }
    }
}