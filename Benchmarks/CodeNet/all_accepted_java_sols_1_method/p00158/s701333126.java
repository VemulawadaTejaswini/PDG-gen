import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int count;

        while((n=sc.nextInt())!=0){
            count=0;
            while(n!=1){
                if(n%2==0){ n=n/2; }
                else{ n=3*n+1; }
                count++;
            }
            System.out.println(count);
        }
    }
}
