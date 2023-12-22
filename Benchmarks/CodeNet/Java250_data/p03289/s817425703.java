import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    char[] str = S.toCharArray();
    
    int countC = 0;
    int countBig = 0;
      if(str[0] == 'A'){
        for(int i = 2 ; i <= str.length-2 ; i++){
          if(str[i] == 'C'){
            countC++;
          }
        }
        if(countC == 1){
          for(int j = 0 ; j < str.length ; j++){
            char h = str[j];
            if(Character.isUpperCase(h)){
              countBig++;
            }
          }
          if(countBig == 2){
            System.out.println("AC");
          }else{
            System.out.println("WA");
          }         
        }else{
          System.out.println("WA");
        }       
      }else{
        System.out.println("WA");
      }   
  }
}