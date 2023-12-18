import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String s = input.next();
    
    for(int i=0;i<s.length();i++)
    {
        int x = s.charAt(i)-'A';
        x = (x+n)%26;
        System.out.print((char)('A'+x));
    }
    
    System.out.println();
    
  }
}