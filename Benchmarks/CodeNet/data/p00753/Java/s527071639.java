import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] sosu = new boolean[123456*2+1];
        Arrays.fill(sosu, true);
        sosu[0]=false;
        sosu[1]=false;
        for(int i=2;i<123456*2;i++){
            if(sosu[i]){
                for(int j=2;i*j<123456*2;j++){
                    sosu[i*j]=false;
                }
            }
        }
        while(true){
            int n = sc.nextInt();            
            if(n==0)break;
            int count=0;
            for(int i=n+1;i<n*2+1;i++){
                if(sosu[i]){
                    count++;
                }else{
                    continue;
                }
            }
            System.out.println(count);
        }
        
    }
}