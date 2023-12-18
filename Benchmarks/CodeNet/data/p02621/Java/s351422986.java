import java.util.*;

class A{
  
	public static void main(String[] args){
      int num1 = integer.parseInt(args[0]);
      int num2 = num1 + (num1 ^ 2) + (num1 ^3);
      if(num1 >=1 && num1 <= 10)
      System.out.println(num2);
    }
}