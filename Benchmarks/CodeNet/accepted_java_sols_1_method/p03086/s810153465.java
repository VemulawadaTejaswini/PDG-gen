import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String[] ss =s.split("",0);
    int max=0,index=0;
    for (String value : ss) {
      if (value.equals("A") || value.equals("C") || value.equals("G") || value.equals("T")) {
        index++;
        max = Math.max(max, index);
      } else {
        max = Math.max(max, index);
        index = 0;
      }

    }
    System.out.println(max);
  }
}
