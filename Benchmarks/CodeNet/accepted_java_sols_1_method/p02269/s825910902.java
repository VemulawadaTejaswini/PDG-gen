import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int User_input_rate= input.nextInt();
    Set<String>Work=new HashSet<>();
    for(int i =0;i<User_input_rate;i++) {
    	String order = input.next();
    	String input_content = input.next();
    	if(order.equals("insert")) {
    		Work.add(input_content);
    	}
    	if(order.equals("find")) {
    		if(Work.contains(input_content)) {
    			System.out.println("yes");
    		}else {
    			System.out.println("no");
    		}
    	  }   	
        }
      }
    }
