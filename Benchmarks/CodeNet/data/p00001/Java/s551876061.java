import java.util.*;

public class Main {

    public static void main(String[] a) {

    	int[] input = new int[10];
    	int w;

    	for(int i=0;i<10;i++){
    		input[i] = new Scanner(System.in).nextInt();
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