import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long A = scan.nextLong();
                long V = scan.nextLong();
                long B = scan.nextLong();
                long W = scan.nextLong();
                long T = scan.nextLong();
                
                long start = B-A;
                long maibyou = V-W; 
                if(start-(maibyou*T)<0){
                    System.out.println("YES");
                }else{
                    if(A>B){
                            if(10*10*10*10*10*10*10*10*10+A<T*V){
                                System.out.println("YES");
                            }else{
                                 System.out.println("NO");
                        }
                    }else{
                        if(10*10*10*10*10*10*10*10*10-A<T*V){
                                System.out.println("YES");
                        }else{
                                 System.out.println("NO");
                        }
                    }
                }

        }
}