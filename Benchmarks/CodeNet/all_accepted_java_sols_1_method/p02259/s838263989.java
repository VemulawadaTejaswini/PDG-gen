import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=1;
        
            n = sc.nextInt();
            
            int x[] = new int[n]; 
            for(int i=0;i<n; i++){
                x[i] = sc.nextInt();
            }
            int cnt=0,z;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n-1;j++){
                if(x[j] > x[j+1]){
                    cnt++;
                    z = x[j];
                    x[j] = x[j+1];
                    x[j+1] = z;
                }
                }    
            }
            for(int i = 0; i<n-1;i++){
                System.out.printf("%d ",x[i]);
            }
            System.out.printf("%d%n%d%n",x[n-1],cnt);
        
        
        sc.close();
    }
}

