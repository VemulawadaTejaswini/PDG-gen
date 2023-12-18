import java.util.Scanner;
 
 
public class Main{
     
	public static int cat(char[] input, int start, int end){
		if(input[start] != 'm'){
			return start;
		}
		
		int might_e = cat(input, start + 1, end);
		
		if(input[might_e] != 'e'){
			return might_e;
		}
		
		int might_w = cat(input, might_e + 1, end);
		
		if(input[might_w] != 'w'){
			return might_w;
		}
		
		return might_w + 1;
	}
	
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	char[] input = sc.next().toCharArray();
    	
    	final int ret = cat(input, 0, input.length - 1);
    	
    	if(ret == input.length){
    		System.out.println("Cat");
    	}else{
    		System.out.println("Rabbit");
    	}
    	
    }
     
}