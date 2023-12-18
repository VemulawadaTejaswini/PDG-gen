import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int count = 0;

        while(count < c){
            if(a <= b){
                count++;
                b -= a;
            }
            else{
                break;
            }
        }

        System.out.println(count);
        
    }
}