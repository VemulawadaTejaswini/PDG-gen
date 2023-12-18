import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer L[]  =new Integer[N];
        for(int i=0;i<N;i++){
            L[i]=sc.nextInt();
        }
        Arrays.sort(L,Collections.reverseOrder());
        
        int a,b,c;
        int count=0;
        //a+b>c かつ b+c>a かつ  c+a>b
        for(int i=0;i<=N-3;i++){
            a=L[i];
            for(int j=i+1;j<=N-2;j++){
                b=L[j];
                for(int k=j+1;k<=N-1;k++){
                    c=L[k];
                    if(b+c>a&&a!=b&&b!=c&&a!=c){
                        count+=1;
                    }
                    
                }
            }

        }
        System.out.println(count);
    }
}
