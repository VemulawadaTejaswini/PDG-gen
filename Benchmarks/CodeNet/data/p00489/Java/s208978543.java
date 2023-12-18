import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
         
        int n = stdIn.nextInt();
        int[] t = new int[n+1];
        for(int i=0;i<n*(n-1)/2;i++){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            int c = stdIn.nextInt();
            int d = stdIn.nextInt();
            if(c>d){
                t[a]+=3;
            }
            else if(c<d){
                t[b]+=3;
            }
            else{
                t[a]+=1;
                t[b]+=1;
            }
        }
        int[] r = new int[n];
        for(int i=1;i<=n;i++){
            r[i-1] = t[i];
        }
        Arrays.sort(r);
        int[] r2 = new int[n+1];
        int cnt = 1;
        int z;
        for(int i=n-1;i>=0;){
            z=0;
            for(int j=1;j<=n;j++){
                if(r[i]==t[j]){
                    r2[j] = cnt;
                    z++;
                }
            }
            cnt+=z;
            i-=z;
        }
        for(int i=1;i<=n;i++){
            System.out.println(r2[i]);
        }
    }
}