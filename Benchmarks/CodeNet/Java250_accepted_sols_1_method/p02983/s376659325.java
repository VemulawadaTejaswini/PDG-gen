import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        long l = sc.nextInt();
        long r = sc.nextInt();

//        int min =0;

//        if ((l<2019)&&(r<2019)){
//            min = Math.min(min)
//            System.out.println(l*(l+1)%2019);
//        }else if ((l<2019)&&(2019<=r)){
//            System.out.println(0);
//        }else if(l==2019){
//            System.out.println(0);
//        }else if ((2019<l)&&(r<=2019*2-1)){
//            System.out.println(l*(l+1)%2019);
//        }else if ((2019<l)&&(2019*2<=r)){
//            System.out.println(0);
//        }
         long min= l*(l+1)%2019;


        if ((l%2019==0) || (r%2019==0)){
            System.out.println(0);
        }else if ((l/2019)!=(r/2019)){
            System.out.println(0);
        }else if ((l/2019)==(r/2019)) {
            for (long i = l; i < r; i++) {
                for (long j = i + 1; j < r + 1; j++) {
                    min = Math.min(min, i * j % 2019);
                }
            }
            System.out.println(min);

        }
    }
}
