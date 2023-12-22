import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;

        if(s.substring(2,3).equals(s.substring(3,4))){
            i++;
        }
        if(s.substring(4,5).equals(s.substring(5,6))){
            i++;
        }
        if(i==2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        } 
    }
}