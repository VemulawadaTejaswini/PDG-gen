import java.util.*;

class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
    //int 整数
    int x = sc.nextInt();
    //長さ
    int n = sc.nextInt();
    int minDiff = x;
    int pNot[] = new int[102];
    int ans = 0;
    
    for(int i = 0; i <= 101;i++)
      pNot[i] = 1;
    
    
    for(int i = 0; i < n; i++)
      pNot[sc.nextInt()] = 0;
    
    
    for(int i = 0;i <= 101; i++)
      if(pNot[i] == 1)
        if(minDiff > Math.abs(x - i)){
          minDiff = Math.abs(x - i);
          ans = i;
        }
      
    
    System.out.println(ans);
  }
}
