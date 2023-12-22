import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  	Scanner scan = new Scanner(System.in);
    
    String str = scan.next();
  
    int len = str.length();
   
    String ans[] = new String[10];
    int i;
    int j = 0;
    for(i = 0; i < len; i++){
      if(str.charAt(i) != 'B'){
      	ans[j] = String.valueOf(str.charAt(i));
        j++;
      }
      else if(str.charAt(i) == 'B'){
        if(j != 0){
          j--;
          ans[j] = "";
        }
      	
      }
    }
    
    for(String a : ans){
      if(a != null){
         System.out.print(a);     
      }
      else{
      	break;
      }
    }
  }
}
