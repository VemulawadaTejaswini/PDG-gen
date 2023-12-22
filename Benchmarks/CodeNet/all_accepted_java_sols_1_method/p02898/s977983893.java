import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int total = 0;
    for(int i = 0;i<n;i++){
      int h = sc.nextInt();
      if(h>=k)total++;
    }
    System.out.println(total);
  }
}
