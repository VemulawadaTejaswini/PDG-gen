import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    
    int index = 0;
    int count = 1;
    while(index < n-1){
      	index++;
    	if(s.charAt(index-1) != s.charAt(index))
          count++;
          
    }
    System.out.println(count);
    
  }
}