import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x[] = {7,5,3};
        String w[] = {"YES","NO"};
        		
	    		if(a == x[0] || a == x[1] || a == x[2]){
	    			System.out.println(w[0]);
	    		}else{
	    			System.out.println(w[1]);
	    		}
	    		
	    }
	}
