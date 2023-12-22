import java.util.*;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  char value = sc.nextLine().toCharArray()[0];
  if(Character.isUpperCase(value))
    System.out.println('A');
  else
    System.out.println('a');
}
}