import java.util.*;
public class Main {
    
    public static void main(String[] args) throws InterruptedException{
            Scanner sc = new Scanner(System.in);
            
            int counter = 0;
            
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                if(i+1 == a[a[i]-1])
                    counter++;
            }
            System.out.println(counter/2);
    }
}