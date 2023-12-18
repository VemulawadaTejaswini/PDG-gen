import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long X = scan.nextLong();
                long K = scan.nextLong();
                long D = scan.nextLong();              
                  
                if(X<=0){
                    int cnt = 0;
                    while(X<=0){
                        X = X + D;
                        cnt++;
                        
                        if(cnt>=K){
                            System.out.println(Math.abs(X));
                            System.exit(0);
                        }
                    }
                    
                    long Xhu = -(X-D);
                    long Xsei = X;
                    
                    if((K-cnt)%2==1){
                        System.out.println(Xhu);
                    }else{
                        System.out.println(Xsei);
                    }
                    
                }else{
                    int cnt = 0;
                    while(X>=0){
                        X = X - D;
                        cnt++;
                        
                        if(cnt>=K){
                            System.out.println(Math.abs(X));
                            System.exit(0);
                        }
                    }
                    
                    long Xhu = -X;
                    long Xsei = X+D;
                    
                    if((K-cnt)%2==0){
                        System.out.println(Xhu);
                    }else{
                        System.out.println(Xsei);
                    }
                }
                
        }
}