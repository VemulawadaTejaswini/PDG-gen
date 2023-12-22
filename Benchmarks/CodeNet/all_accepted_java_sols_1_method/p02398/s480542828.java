import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int result = 0;
        while(a<=b){
            if(c%a==0){
                result++;
            }
            a++;
        }
        System.out.println(result);
    }
}