import java.util.*;

public class Main{ 
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    char[] list = S.toCharArray();
    
    int count = 0;
    int countMax = 0;
    
    for(int i = 0; i < list.length; ++i){
      if(list[i] == 'A' || list[i] == 'C' || list[i] == 'G' || list[i] == 'T'){
        count++;
        for(int j = i+1; j < list.length; ++j){
          if(list[j] == 'A' || list[j] == 'C' || list[j] == 'G' || list[j] == 'T'){
            count++;
          }
          else{
             break; 
          }
        }
      }
      if(countMax < count){
         countMax = count;
      }     
      count = 0;
    }
    

      
     System.out.println(countMax);
  }
} 
