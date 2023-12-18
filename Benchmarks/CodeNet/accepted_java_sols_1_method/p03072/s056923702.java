import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    int count = 1;
	    int max = sc.nextInt();
	    
	    for (int i=1; i<N; i++){
	    	int temp = sc.nextInt();
	    	
	    	if (temp>=max){
	    		count++;
	    		max=temp;
	    	}
	    }
	    System.out.println(count);
		sc.close();
	}

}