import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] v=new int[n];
        int[] c=new int[n];
        for(int i=0; i<n; i++){
            v[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            c[i]=sc.nextInt();
        }

        int profit=0;
        for(int i=0; i<n; i++){
            int temp=v[i]-c[i];
            if(temp>0){
                profit+=temp;
            }
        }
        System.out.println(profit);
    }
}
