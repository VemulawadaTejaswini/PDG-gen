import java.util.*;

public class Main{
  public static void main(String[] args){
    int k;
    String str = "ACL";
    String result = "";
    Scanner sc = new Scanner(System.in);
 	
    k = sc.nextInt();
    
    for(int i = 1; i <= k; i++){
    	result = result + str;
    }
    
    System.out.println(result);
  }
}