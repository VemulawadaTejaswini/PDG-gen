import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<6;i++){
            if(sc.nextInt() == 0){
                System.out.println(i);
            }
        }


    }

}
