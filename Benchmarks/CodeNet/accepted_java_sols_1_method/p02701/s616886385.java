import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[] S=new String[N];
        
        for(int i=0;i<N;i++){
            S[i]=sc.next();
        }
        
        Arrays.sort(S);
        int ans=1;
        
        for(int i=1;i<N;i++){
            if(S[i].equals(S[i-1])){
                
            }else{
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
