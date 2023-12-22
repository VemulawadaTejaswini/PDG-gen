import java.util.*;

public class Main{
  public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    
    String s=sc.next();
    
    char[]sArray=s.toCharArray();
    
    String result = "No";
		if ((sArray[0] == sArray[1] && sArray[2] == sArray[3] && sArray[0] != sArray[2])
				|| (sArray[0] == sArray[2] && sArray[1] == sArray[3] && sArray[0] != sArray[1])
				|| (sArray[0] == sArray[3] && sArray[1] == sArray[2] && sArray[0] != sArray[1])) {
			result = "Yes";
		}
 
		System.out.println(result);
		sc.close();
	}
}
    
