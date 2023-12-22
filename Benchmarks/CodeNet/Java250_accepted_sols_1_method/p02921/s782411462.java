import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      String S =sc.next();
      String T =sc.next();
      int count =0;
      
    if(S.substring(0,1).equals(T.substring(0,1))){
        count++;   
      }
    if(S.substring(1,2).equals(T.substring(1,2))){
      count++;
      }
    if(S.substring(2,3).equals(T.substring(2,3))){
      count++;
    }
     System.out.print(count);
    }
}