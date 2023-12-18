
    import java.util.*;
    public class Main{
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    
	    int numM = scan.nextInt();
	    int[] numArray = new int[numM]; 
	    int min;
	    int max;
		for(int i = 0; i < numM;i++){
		    numArray[i] = scan.nextInt();
		}
		min = numArray[0];
		max = numArray[0];
		for(int i =1; i <numM; i++){
		    
			if(min > numArray[i]){
			    min = numArray[i];
			}
			if(max < numArray[i]){
			    max = numArray[i];
			}
		    
		}
		System.out.println(max-min);
		
	    
	   
	}
    }
