import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] a){

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int[] input = new int[10];
    	int w;

    	for(int i=0;i<10;i++){
    		input[i] = Integer.parseInt(br.readLine());
    	}

    	for(int i=0;i<9;i++){

    		for(int j=0;j<9;j++){

    			if(input[j] < input[j+1]){
    				w = input[j];
    				input[j] = input[j+1];
    				input[j+1] = w;
    			}

    		}

    	}

    	for(int i=0;i<3;i++){
    		System.out.println(input[i]);
    	}

    }
}