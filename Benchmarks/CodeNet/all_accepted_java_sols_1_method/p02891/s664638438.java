import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] chars=s.toCharArray();
        long k=Long.parseLong(sc.next());
        int len=s.length();
        char first=chars[0];
        char last=chars[len-1];
        char seeing=first;
        long same=0;
        long ans=0;
        if(first!=last){
            for(char c:chars){
                if(c==seeing){
                    same++;
                    
                }
                else{
                    ans+=same/2;
                    same=1;
                    seeing=c;
                }
            }
            if(same>1){
                ans+=same/2;
            }
            ans*=k;
        }
        else{
            int left_repeat=1;
            int right_repeat=1;
            boolean all_same=true;
            for(int i=1;i<len;i++){
                if(chars[i]!=first){
                    left_repeat=i;
                    all_same=false;
                    break;
                }
            }
            for(int i=1;i<len;i++){
                if(chars[len-1-i]!=last){
                    right_repeat=i;
                    all_same=false;
                    break;
                }
            }
            if(all_same){
                ans=(long) len*k/2;
            }
            else{
                seeing=chars[left_repeat];
                for(int i=left_repeat;i<len-right_repeat;i++){
                    if(chars[i]==seeing){
                        same++;
                    }
                    else{
                        ans+=same/2;
                        same=1;
                        seeing=chars[i];
                    }
                }
                if(same>1){
                    ans+=same/2;
                }
                ans*=k;
                ans+=(left_repeat/2)+(right_repeat/2)+(k-1)*((left_repeat+right_repeat)/2);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}