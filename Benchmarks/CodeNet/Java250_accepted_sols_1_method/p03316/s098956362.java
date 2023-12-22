import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        for(int i=0; i<10; i++){
            sum += m%10;
            m = m/10;
        }
        if(n%sum==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}