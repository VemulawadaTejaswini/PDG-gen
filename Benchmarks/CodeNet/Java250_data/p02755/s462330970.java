import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    for(int i=1; i<10000;i++){
      if((int)Math.floor(i*0.08)==A&&(int)Math.floor(i*0.1)==B){
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
    return;
  }
}