import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      if(s.length()==6 && s.charAt(2)==s.charAt(3) && s.charAt(4) == s.charAt(5)){
        System.out.println("Yes");
      }else{
      System.out.println("No");
      }
    }
}