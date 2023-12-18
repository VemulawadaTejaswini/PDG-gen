import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String line;
            /* input */
            while(true){
                int n = sc.nextInt();
                if(n==0) return;
                
                int[] nums = new int[n];
                int total = 0;
                for(int i=0;i<n;i++){
                	nums[i] = sc.nextInt();
                	total += nums[i];
                }
                
                int sum, index = 0, diff = 0, min = total;
                
                while(index<Math.pow(2, n)){
                	sum = 0;
                	for(int i=0;i<n;i++){
                		if((1 << i&index)>0) sum += nums[i];
                	}
                	diff = Math.abs(total - 2*sum); 
                	if(diff<=1){
                		min = diff;
                		break;
                	}
                	if(diff<min) min = diff;
                	index = index + 1;
                }
                
                System.out.println(min);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}