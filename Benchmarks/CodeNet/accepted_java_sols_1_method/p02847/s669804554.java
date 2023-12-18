import java.util.*;
  
  class Main{
  	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String input =sc.nextLine();
           
      if(input.equals("SUN"))System.out.println('7');
      if(input.equals("MON"))System.out.println('6');
      if(input.equals("TUE"))System.out.println('5');
      if(input.equals("WED"))System.out.println('4');
      if(input.equals("THU"))System.out.println('3');
      if(input.equals("FRI"))System.out.println('2');
      if(input.equals("SAT"))System.out.println('1');
    }
  }