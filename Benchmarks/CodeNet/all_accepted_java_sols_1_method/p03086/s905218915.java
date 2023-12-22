import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
class Main
{
  public static void main(String[] args)throws Exception {
    
    //System.out.println("Hello Codiva");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String str = br.readLine();
    int count = 0 ;
    ArrayList<Integer> a = new ArrayList<>();
   	for(int i= 0 ;i<str.length() ; i++){
      if(str.charAt(i) == 'G' || str.charAt(i) == 'C' || str.charAt(i) == 'T' || str.charAt(i) == 'A'){
    		count += 1 ;
       }
      else{
        if(count!=0){
          a.add(count);
          count = 0 ;
        }
      }
    
    }
     if(count!=0){
          a.add(count);
          count = 0 ;
        }
    if(!a.isEmpty()){
    int max = Collections.max(a , null);
    System.out.println(max);
    }else{
      System.out.println(0);
    }
  }
}
