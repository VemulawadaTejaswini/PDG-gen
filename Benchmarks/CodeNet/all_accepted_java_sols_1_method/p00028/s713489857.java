import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int[] num = new int[100];
    	while(input.hasNext()){
    		num[input.nextInt()-1]++;
    	}
    	int maxcount = 0;
    	for(int i = 0 ; i < 100 ; i++){
    		maxcount = Math.max(num[i], maxcount);
    	}
    	for(int i = 0 ; i < 100 ; i++){
    		if(num[i] == maxcount)System.out.println((i+1));
    	}
		
    }
}