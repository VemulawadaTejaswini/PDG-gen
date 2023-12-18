import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int qt;
    qt = i / (60 * 60);
    System.out.print(qt + ":");
    i -= qt * (60 * 60);
    qt = i / 60;
    System.out.print(qt + ":");
    i -= qt * 60;
    System.out.println(i);
    sc.close();
  }
}

