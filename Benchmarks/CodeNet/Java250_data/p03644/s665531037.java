import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count =0;
        int ans =0;
        int x=0;
        int waru=0;
        
        
        
        
        for(int i=1; i<=N;i++){
            count=0;
            waru=i;
            while(waru>=1){
                if(waru==1){
                    count++;
                    waru=0;
                }else if(waru%2==0){
                    count++;
                    waru=waru/2;
                    
                }else if(waru%2==1){
                    waru=waru/2;
                    
                }
                
            }
            if(ans<count){
                ans=count;
                x=i;
            }
            
        }
        System.out.println(x);
    }
}
