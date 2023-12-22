import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();

      char c;

      int[] data = new int[s.length()];

      for(int i = 0;i<s.length();i++){
       c = s.charAt(i);
       data[i] = (int)c +n;
       if(data[i]>90){
         data[i]= Math.abs(90-data[i])+64;
       }
     }

     for(int i = 0;i<s.length();i++){
      System.out.print((char)data[i]);

    }
    System.out.println();


  }
}