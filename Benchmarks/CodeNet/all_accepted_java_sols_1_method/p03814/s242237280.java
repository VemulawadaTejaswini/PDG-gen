import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int len = s.length();
      
      int start = 0;
      for(int i=0; i<len; i++){
        if("A".equals(s.substring(i,i+1))){
            start = i;
            break;
        }
      }  
      int end = 0;
      for(int j=len-1; j>0; j--){
        if("Z".equals(s.substring(j,j+1))){
            end = j;
            break;
        }
      }  

      System.out.println(end-start+1);
    }  
} 