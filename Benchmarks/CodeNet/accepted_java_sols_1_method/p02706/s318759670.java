import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int count = 0;
    while(sc.hasNext()){
      count += sc.nextInt();
    }
    sc.close();
    
    if(count <= n){
      System.out.println(n - count);
    }else{
      System.out.println(-1);
    }
  }
}