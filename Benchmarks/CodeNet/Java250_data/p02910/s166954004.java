import java.util.Scanner;
//import java.util.Arrays; 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    char[] b = a.toCharArray();
    String c = "Yes";
    //System.out.println(Arrays.toString(b));
    for(int i = 0;i < b.length;i++){
      if(i % 2 == 1 && b[i]== 'R'){
        c = "No"; 
      }else if(i % 2 == 0 && b[i] == 'L'){
        c = "No"; 
      }
    }
      System.out.println(c);
  }
}