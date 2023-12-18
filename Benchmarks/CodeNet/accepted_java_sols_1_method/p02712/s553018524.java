import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long i = 1;
        long sum = 0;

        while(i <= N){
            if(((i % 3) == 0) && ((i % 5) == 0)){
            }
            else if(i % 5 == 0){
            }
            else if(i % 3 == 0){

            }else{
                //System.out.println(i);
                sum += i;
                
            }
            i++;
        }
        System.out.println(sum);
    }
}