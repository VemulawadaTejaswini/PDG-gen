
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a=0, b=0;
        boolean flag = false;
        for(a=0;a<200;a++){
            for(b=0;b<200;b++){
                if(a*a*a*a*a - b*b*b*b*b == x){
                    flag = true;
                    break;
                }else if(a*a*a*a*a + b*b*b*b*b == x){
                    b *= -1;
                    flag = true;
                    break;
                }else if(- a*a*a*a*a - b*b*b*b*b == x){
                    a *= -1;
                    flag = true;
                    break;
                }else if(- a*a*a*a*a + b*b*b*b*b == x){
                    a *= -1;
                    b *= -1;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println(a + " " + b);
    }
}
