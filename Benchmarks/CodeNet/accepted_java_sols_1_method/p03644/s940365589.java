import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nam = in.nextInt();
		int nam2[] = {1,2,4,8,16,32,64};
	    
	    int memo = 0;
	    for(int i = 0;i < 7; i++){
	        if(nam>=nam2[i]){
	            memo = nam2[i];
	        }
	    }

        System.out.print(memo);
	}
}