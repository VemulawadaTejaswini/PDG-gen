import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      String t = sc.next();
      
      if(s.equals(t)){
        System.out.print("0");
        return;
      }
        
      
      int result = 0;
      for(int i=0; i < s.length(); i++){
      	if(!s.substring(i,i+1).equals(t.substring(i, i+1))){
          result++;
        }
      }
        
      System.out.print(result);
    }
}
