import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int len=S.length();
        int[] num=new int[len];
        
        for(int i=0;i<len;i++){
            num[i]=Character.getNumericValue(S.charAt(i));
        }
        
        int[] mod=new int[len];
        mod[len-1]=1;
        
        for(int i=len-1;i>=1;i--){
            mod[i-1]=(mod[i]*10)%2019;
        }
        
        int[] U=new int[len+1];
        U[len-1]=num[len-1];
        U[len]=0;
        
        for(int i=len-1;i>=1;i--){
            U[i-1]=(U[i]+num[i-1]*mod[i-1])%2019;
        }
        
        Arrays.sort(U);
        int count=1;
        long ans=0;
        
        for(int i=0;i<len;i++){
            if(U[i]==U[i+1]){
                count++;
            }else{
                ans+=(count*(count-1))/2;
                count=1;
            }
        }
        
        ans+=(count*(count-1))/2;
        System.out.println(ans);
    }
}
