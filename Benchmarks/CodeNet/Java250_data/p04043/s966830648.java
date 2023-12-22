import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int count5 = 0;
        int count7 = 0;
        for(int i = 0; i < 3; i++){
        	int n = sc.nextInt();
            if(n == 5){
            	count5++;
            }else if(n == 7){
            	count7++;
            }
        }
        if(count5 == 2 && count7 == 1){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
	}
}