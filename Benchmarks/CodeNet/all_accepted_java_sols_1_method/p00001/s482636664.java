import java.util.Scanner;

class Main {

    public static void main(String[] a){

    	Scanner s = new Scanner(System.in);

    	int[] input = new int[10];
    	int w;

    	for(int i=0;i<10;i++){
    		input[i] = s.nextInt();
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