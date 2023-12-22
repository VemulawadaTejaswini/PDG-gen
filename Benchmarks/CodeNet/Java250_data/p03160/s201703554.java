import java.util.*; 
  
public class Main{

    public static int n;

    public static int [] arr = new int[100000];

    public static int [] darr = new int[100000];

    public static int minCostJump(int i){

        if(darr[i] != -1) return darr[i];

        if(i == n-1) return 0;

        if(i > n) return Integer.MAX_VALUE;
        
        if(i+2 < n)
        return darr[i] = Math.min(minCostJump(i + 1) + Math.abs(arr[i] - arr[i+1]), minCostJump(i + 2) + Math.abs(arr[i] - arr[i+2]));

        return darr[i] = minCostJump(i + 1) + Math.abs(arr[i] - arr[i+1]);
    } 

    public static void main(String args[]) 
    { 
        Scanner in = new Scanner(System.in); 
  
        n = in.nextInt();

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            darr[i] = -1;
        }

        int jumps = minCostJump(0);

        System.out.println(jumps);
    }

} 