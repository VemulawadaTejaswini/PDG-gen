import java.util.*;

class Main {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String input = in.next();
      if(input.length() == 2){
           System.out.println(input);
     }else{
         StringBuilder sb = new StringBuilder();
         for(int i = input.length()-1; i >= 0; i--){
              sb.append(input.substring(i, i+1));
         }
         System.out.println(sb.toString());
      }  
}

}