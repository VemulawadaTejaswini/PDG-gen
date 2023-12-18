import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int[] data=new int[S.length()];
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='B'){
                data[i]=1;
            }else{
                data[i]=0;
            }
        }
        
        long ans=0L;
        int Wsum=0;
        
        for(int i=0;i<S.length();i++){
            if(data[i]==0){
                ans+=(i-Wsum);
                Wsum++;
            }
        }
        
        System.out.println(ans);
    }
}
