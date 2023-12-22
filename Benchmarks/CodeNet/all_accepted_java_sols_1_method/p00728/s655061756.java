import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            int sum=0;
            int[] data = new int [n];
            for(int i=0;i<n;i++){
                
                data[i]=sc.nextInt();
            }
            Arrays.sort(data);
            for(int i=1;i<n-1;i++){
                sum+=data[i];
            }
            System.out.println(sum/(n-2));
        }
        
        sc.close();
    }
}

