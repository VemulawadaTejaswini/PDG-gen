import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int N;
      while (scan.hasNextLine()) {
      String an = scan.nextLine();
      list.add(an);
      }
      String List[] = list.get(0).split(" ",0);
      N = Integer.parseInt(List[0]);
 
  // System.out.println(N);
     
      calc(N);
        scan.close();
    }
  
  public static void calc(int n){
    int chage = 10000;
    chage = chage - n;
     while(chage >= 1000){
       chage = chage -1000;
     }
    System.out.println(chage);
    return;
    }
}