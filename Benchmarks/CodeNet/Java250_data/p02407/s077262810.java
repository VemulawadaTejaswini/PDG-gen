import java.util.Scanner;
public class Main {
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt(); //n????????\?????????????????????
	        StringBuilder NewBuilder = new StringBuilder(); 
	    	int [] a  = new int[n];
	    	 
	    	for(int i = 0; i < n ; i++) {
	    		a[i] = sc.nextInt();
	    	}

            for(int i = n; i >= 1; i--){
            	 
                int x = a[i-1];
                NewBuilder.append(x);
     
                if(i == 1){
                    break;
                }
                NewBuilder.append(" ");
            }
            NewBuilder.append("\n");
            System.out.print(NewBuilder);

    }	        

}