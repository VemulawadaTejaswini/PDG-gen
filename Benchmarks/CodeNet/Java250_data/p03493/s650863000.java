import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String line = sc.nextLine();
      	String[] num = line.split("");
      	
      	int count = 0;
      	if(num[0].equals("1")){
        	count++;
        }
      	if(num[1].equals("1")){
        	count++;
        }
      	if(num[2].equals("1")){
        	count++;
        }
      System.out.println(count);
    }
}