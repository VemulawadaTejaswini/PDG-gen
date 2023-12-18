import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int p[] = new int[n];
        
        for(int i = 0; i < n; i++){
            p[i] = stdIn.nextInt();
        }
        
        Arrays.sort(p);
        
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += p[i];
        }
        //boolean flag = true;
        
        System.out.println(sum);
        //if(flag){
        //    System.out.println("Yes");
        //}else{
        //    System.out.println("No");
        //}
    }
}
