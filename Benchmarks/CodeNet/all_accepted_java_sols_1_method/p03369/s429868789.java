import java.util.*;
//import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int m = 700;
        
        for(int i=0; i<3; i++){
            if(str.charAt(i)=='o'){
                m += 100;
            }
        }
        System.out.println(m);
    }
}
