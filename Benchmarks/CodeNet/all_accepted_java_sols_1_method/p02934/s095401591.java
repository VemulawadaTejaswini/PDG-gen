import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double t = 0;
    for(int i = 0;i<n;i++){
      t += 1/sc.nextDouble();
    }
    System.out.println(1/t);
  }
}
