import java.util.Scanner;
public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String data = sc.nextLine();
  int distance = 'A' - 'a';
  for(int i = 0 ; i < data.length() ; i++)
  {
   char c = data.charAt(i);
   if(c >= 'a' && c <= 'z'){
    c += distance;
    System.out.print(c);
   }
   else if(c >= 'A' && c <= 'Z'){
    c -= distance;
    System.out.print(c);
   }
   else
    System.out.print(c);
  }
  System.out.println();
 }
}
