import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int Q= sc.nextInt();

        String S=sc.next();
        char[] s=S.toCharArray();
        int [] num=new int[N];
        int count=0;
        for(int i=0;i<N-1;i++){
            if(s[i]=='A'&&s[i+1]=='C'){
                count++;    
            }
            num[i+1]=count;
            
        }
        int l=0;
        int r=0;
        for(int i=0;i<Q;i++){
            l=sc.nextInt()-1;
            r=sc.nextInt()-1;
            System.out.println(num[r]-num[l]);
        }
        
        
        
        
        
    }
}
