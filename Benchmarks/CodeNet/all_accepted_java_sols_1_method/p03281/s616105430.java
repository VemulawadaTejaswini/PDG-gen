import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int ans=0;
        
        if(n<105){
            System.out.println(0);
            return;
        }
        
        for(int i=105; i<=n; i++){
            //System.out.println(ans);
            int count=0;
            for(int j=2; j<i; j++){
                //System.out.println(j);
                if(i%j==0){
                    //System.out.println(j);
                    count++;
                }
            }
            if(count==6){
                ans++;
            }
            i++;
        }

        System.out.println(ans);
        
	}
}