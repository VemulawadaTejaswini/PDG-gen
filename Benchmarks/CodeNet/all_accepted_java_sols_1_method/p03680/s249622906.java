import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int ans = -1;

    
    int[] list = new int[n];
    boolean flg = false;
    for (int i =0; i < n; i++){
      list[i] = sc.nextInt();
      if(list[i] == 2){
        flg = true;
      }
    }
    
    boolean[] flgList = new boolean[n];
    
    if (flg){
      int a = 0;
      int count = 0;
      do{
        flgList[a] = true;
        a = list[a] - 1;
        count++;
          
        if (a == 1){
          ans = count;
          break;
        }
      }while (!flgList[a]);
      
    }
    
    System.out.print(ans);
    
  }
}