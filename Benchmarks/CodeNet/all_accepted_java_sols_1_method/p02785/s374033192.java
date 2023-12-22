import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        int h[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        long sum = 0;
        //c[0] += 1;
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < n; i++){
            h[i] += stdIn.nextInt();
        }
        
        Arrays.sort(h);
        
        for(int i = 0; i < n - k; i++){
            sum += h[i];
        }
        
        // if(sum >= h){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        
        System.out.println(sum);
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}