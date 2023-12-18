import java.util.*;

public class Main { 
	public static void main(String argsp[]) 
    {	
      	Scanner sc = new Scanner(System.in);
      	String input = sc.nextLine();
      	String[] inputs = input.split(" ");
      	int a = Integer.valueOf(inputs[0]);
      	int b = Integer.valueOf(inputs[1]);
      	if(b%a==0)
        {
           System.out.println(b+a);
        }
      	else {
          System.out.println(b-a);
        }
      	
      	
    }
}