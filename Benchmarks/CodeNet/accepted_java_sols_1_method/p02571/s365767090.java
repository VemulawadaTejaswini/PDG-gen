import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String T = sc.nextLine();
    String S = sc.nextLine();
    
    int count = 0;
    int store = S.length();
    
    for(int i = 0; i<=T.length()-S.length();i++){
      count = 0;
      for(int j = 0;j<S.length();j++){
      	if(S.charAt(j)!=T.charAt(i+j)){
        	count++;
      	}
      }
      if (store>=count) store = count; 
    }
    System.out.println(store);
  }
}
      