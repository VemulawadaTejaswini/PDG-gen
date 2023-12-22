import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    int max = 0;
    
    for(int i = 0 ; i < s.length() ; ++i){
      if('A'==(s.charAt(i))||'C'==(s.charAt(i))||
        'G'==(s.charAt(i))||'T'==(s.charAt(i))){
        count +=1;
        for(int j = i+1 ; j < s.length() ; ++j){
          if('A'==(s.charAt(j))||'C'==(s.charAt(j))||
             'G'==(s.charAt(j))||'T'==(s.charAt(j))){
            count +=1;
          }else{
            break;
          }
        }
        if(max<count){
          max = count;
        }
      count = 0;
      }
     
    }

      System.out.println(max);
    
  }
}