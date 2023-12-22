import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =b-a;
        int highB =0;
        
        for(int i=sum;i>0;i--){
            highB +=i;
        }
        
        System.out.println(highB-b);
        
    }
    
} 