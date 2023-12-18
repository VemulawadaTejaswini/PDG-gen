import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine();
    long multi = 1;
    long max = (long)Math.pow(10.0, 18.0);
    for(int i = 0; i < num; i++){
      multi = multi * sc.nextLong();
      if(max < multi){
        System.out.println("-1");
        return;
      }
    }
    
     System.out.println(multi);
    
  }

}