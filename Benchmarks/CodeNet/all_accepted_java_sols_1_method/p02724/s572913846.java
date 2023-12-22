import java.util.*;
public class Main{
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N=scanner.nextInt();
    int remDiv=((N%500)/5);

    int gc=((N/500)*1000)+(remDiv*5);
    System.out.println(gc);
  }

}