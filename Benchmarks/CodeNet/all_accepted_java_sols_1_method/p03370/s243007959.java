import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] m=new int[N];
        int total=0;
        int count=0;
        
        for(int i=0;i<N;i++){
            m[i] =sc.nextInt();
            X-=m[i];
            count+=1;
            
        }
        
        Arrays.sort(m);
        
        while(X>=m[0]){
            X-=m[0];
            count+=1;
        }
        
        System.out.println(count);
        
        
    }
    
} 