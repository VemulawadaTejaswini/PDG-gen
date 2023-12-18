import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        	String a = scanner.next();
          	List<String> split = Arrays.asList(a.split(""));
            
            int count = 0;
            for(int i = 0; i<3; i++){
            	if(split.get(i).equals("1")){
                	count += 1;
                }
            }    
        System.out.println(count); 
      }
}