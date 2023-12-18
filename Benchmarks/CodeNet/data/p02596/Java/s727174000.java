import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a  = sc.nextLong();
        if (a%2==0 || a%5==0){
            System.out.println(-1);
        }
        else{
            long count = 0;
            long n = 7;
            while(true){
                if(n%a==0){
                    break;
                }
                else{  
                    n = (n%a)*10+7 ;
                    count++;
                }
            }
            System.out.println(count+1);
        }
    }
}