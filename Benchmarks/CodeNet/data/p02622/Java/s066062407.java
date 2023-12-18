import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                String S = scan.next();
                String T = scan.next();
                
                int cnt=0;
                for(int i=0; i<S.length();i++){
                    char a = S.charAt(i);
                    char b = T.charAt(i);
                    if(!(a==b)){
                        cnt++;
                    }
                }
                System.out.println(cnt);
        }               
}
