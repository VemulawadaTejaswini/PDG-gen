import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
        }
        int count = 1;
        loop: for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(h[j]>h[i]){
                    continue loop;
                }
            }
            count++;
        }
        
        System.out.println(count);
    }
}
