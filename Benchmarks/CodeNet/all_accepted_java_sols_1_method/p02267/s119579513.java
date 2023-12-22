   
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int numberOfMatches = 0;
        int[] firstArray = new int[a];
        for(int i = 0; i < firstArray.length;i++) 
        {
        
        	firstArray[i] = in.nextInt();
        }
        int c = in.nextInt(); 
        int[] secondArray = new int[c];
        for(int j = 0; j < secondArray.length;j++) 
        {
        	int d = in.nextInt();
        	secondArray[j] = d;
        }
        
        for(int h = 0; h < secondArray.length;h++) 
        {
        	for(int g = 0; g < firstArray.length;g++) 
        	{
        	if(secondArray[h] == firstArray[g]) {numberOfMatches++;break;} 
        	}
        }
        
        
        System.out.println(numberOfMatches);
	}

}
