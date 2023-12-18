import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String line = sc.nextLine();
    line = sc.nextLine();
    String[] spl = line.split("");
    spl[k-1] = spl[k-1].toLowerCase();
//    System.out.println(spl[k-1]);
    line = "";
    for(int i = 0; i < n; i++){
//      System.out.println(spl[i]);
      line += spl[i];
    }
    System.out.println(line);
  }
}