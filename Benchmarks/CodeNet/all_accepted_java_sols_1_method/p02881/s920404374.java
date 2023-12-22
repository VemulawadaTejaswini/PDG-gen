import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long checkx = 0;
        long x = 0;
        long checky = 0;
        long y = 0;


        for(checkx = 1;checkx <= Math.sqrt(n);checkx++){
            if(n%checkx==0){
                checky = n/checkx;
                if(x==0 && y==0){
                    x = checkx;
                    y = checky;
                }
                if(checkx + checky <  x +y){
                    x = checkx;
                    y = checky;
                }
            }
        }
        System.out.println(x+y-2);
    }
}