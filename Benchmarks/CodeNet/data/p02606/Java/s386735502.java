import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int L = scan.nextInt();
                int R = scan.nextInt();
                int d = scan.nextInt();
                int cnt = 0;
                for(int i=L;i<=R;i++){
                    if(i%d==0){
                        cnt++;
                    }
                }
                
                System.out.println(cnt);
        }               
}