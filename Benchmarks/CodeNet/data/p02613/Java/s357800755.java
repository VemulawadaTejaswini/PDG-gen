import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
               
                int C0 = 0;
                int C1 = 0;
                int C2 = 0;
                int C3 = 0;
                
                for(int i=0; i<N; i++){
                    String S = scan.next();
                    if(S.equals("AC")){
                        C0++;
                    }else if(S.equals("WA")){
                        C1++;
                    }else if(S.equals("TLE")){
                        C2++;
                    }else if(S.equals("RE")){
                        C3++;
                    }
                }
                
                System.out.println("AC x " + C0);
                System.out.println("WA x " + C1);
                System.out.println("TLE x " + C2);
                System.out.println("RE x " + C3);
             
        }               
}