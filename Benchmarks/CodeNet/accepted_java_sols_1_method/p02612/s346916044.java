
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 1;
        long p = 1000 * a;
        if(p>=n){
            System.out.println(p-n);
        }
        while(n > p){
            a++;
            p = 1000*a;
            if(p>=n){
                System.out.println(p-n);
                break;
            }
            
        }
    }
}



