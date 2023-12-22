import java.util.*;
public class Main {
   public static void main(String args[]){
      //declaration and initialization
      Scanner sc = new Scanner(System.in);
      String input[];
      
      //variables for each problem
      String answer;
      int a;
      int b;
      int c;
      
      //reading the intput
      input = sc.nextLine().split(" ",0);
      
      //assginment
      a = Integer.parseInt(input[0]);
      b = Integer.parseInt(input[1]);
      c = Integer.parseInt(input[2]);
      
      //evaluation
      if(a >= b){
         answer = "No";
      }else if(b >= c){
         answer = "No";
      }else{
         answer = "Yes";
      }
      
     //output
     System.out.println(answer);
      
      
      
   }//main
      
}//class