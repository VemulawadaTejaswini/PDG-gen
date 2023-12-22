import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tapSize = sc.nextInt();
    int target = sc.nextInt();
    int tapCnt = 1;
    int useTap = 0;
    while(tapCnt < target){
      tapCnt--;
      tapCnt += tapSize;
      useTap++;
    }
    
    System.out.println(useTap);
  }
}