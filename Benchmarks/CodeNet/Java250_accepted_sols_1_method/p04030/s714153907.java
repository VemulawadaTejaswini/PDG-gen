import java.util.*;
public class Main {

  public static void main(String[] args) {
   Scanner no=new Scanner(System.in);
   StringBuilder sb=new StringBuilder();
   Stack<Character> st=new Stack<Character>();
   String s=no.next();
   for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='B'){
        if(st.isEmpty()){
          continue;
        }
        else
         st.pop();
       }
       else{
         //System.out.println(s.charAt(i));
         st.push(s.charAt(i));
       }
   }
   for(int i=st.size()-1;i>=0;i--){
     sb.append(st.pop());
   }
   System.out.println(sb.reverse());
  }

}