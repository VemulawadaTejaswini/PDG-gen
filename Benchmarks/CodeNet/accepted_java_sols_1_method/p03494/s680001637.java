import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);

    	int n =scanner.nextInt();
    	
    	

    	int[] data=new int[n];

    	
    	for (int i = 0; i < data.length; i++) {
			data[i]=scanner.nextInt();
			
		}
    	int result=0;

    	while(true){

        	boolean hasOdd=false;

        	for(int i=0;i<n;i++) {
        		if(data[i]%2 != 0) {
        			hasOdd=true;
        			break;
        		}
        	}

        	if(hasOdd) {break;};

        	for(int i=0;i<n;i++) {
        		data[i]/=2;
        	}

        	result++;

    	}

    	System.out.println(result);

    	scanner.close();


    }

}