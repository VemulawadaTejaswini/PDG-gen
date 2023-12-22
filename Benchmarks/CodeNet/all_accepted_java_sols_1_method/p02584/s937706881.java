import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long X = scan.nextLong();
                long K = scan.nextLong();
                long D = scan.nextLong();              
                  
                if(X<=0){
                    long sho = -(X/D);
                    long amari = X%D+D;

                    if(sho>=K){
                        System.out.println(Math.abs(X+(K*D)));
                        System.exit(0);
                    }
                    
                    long Xhu = -(amari-D);
                    long Xsei = amari;
                    
                    if((K-sho)%2==0){
                        System.out.println(Xhu);
                    }else{
                        System.out.println(Xsei);
                    }
                    
                }else{
                    long sho = X/D;
                    long amari = X%D;
                    if(sho>=K){
                        System.out.println(Math.abs(X-(K*D)));
                        System.exit(0);
                    }
            
                    long Xhu = -(amari-D);
                    long Xsei = amari;
                    
                    if((K-sho)%2==1){
                        System.out.println(Xhu);
                    }else{
                        System.out.println(Xsei);
                    }
                }
                
        }
}