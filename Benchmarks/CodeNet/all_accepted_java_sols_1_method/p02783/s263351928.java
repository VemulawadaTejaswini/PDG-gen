import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int ret = 0 ;
            if(n%m > 0){
                ret = n/m +1;
            }else{
                ret = n/m;
            }
                System.out.println(ret);
            }
        }