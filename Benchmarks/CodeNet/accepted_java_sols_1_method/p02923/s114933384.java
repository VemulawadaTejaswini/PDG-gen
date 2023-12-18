import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Height[] = new int[N];
        int ans=0;
        int Max=0;
        for(int i=0;i<N;i++){
            Height[i]=scan.nextInt();
            if(i!=0&&Height[i-1]>=Height[i]){
                ans++;
              if(ans>Max){
                Max=ans;
              }
            }else if(i!=0&&Height[i-1]<Height[i]){
                ans=0;
            }
        }
        
        System.out.println(Max);
    }
}
