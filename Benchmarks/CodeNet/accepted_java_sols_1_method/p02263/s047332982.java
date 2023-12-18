import java.util.Scanner;
import java.util.Stack;

public class Main {
   public static Scanner sc=new Scanner(System.in);
  
       public static void main(String[] args) {
           String s;
           s=sc.nextLine();
           String a[]=s.split(" ");
           Stack<Integer> st=new Stack<>();
           for(int i=0;i<a.length;i++) {
               boolean numeric = true;
                try {
                    int num = Integer.parseInt(a[i]);
                } catch (NumberFormatException e) {
                    numeric = false;
                }
               if(numeric) {
                   st.push(Integer.parseInt(a[i]));
               }else {
                   int val1=st.pop();
                   int val2=st.pop();
                   switch(a[i]) {
                   case "+":
                       st.push(val2+val1);
                       break;
                   case "-":
                       st.push(val2-val1);
                       break;
                   case "*":
                       st.push(val2*val1);
                       break;
                   case "/":
                       st.push(val2/val1);
                       break;
                   }
               }
           }
          
           System.out.println(st.pop());
          
       }
}
