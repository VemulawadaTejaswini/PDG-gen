import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] s = S.toCharArray();
    int len = S.length();
    int[] ans = new int[len];
    for(int i = 0;i < len - 1;i++){
      if(s[i] == 'R' && s[i+1] =='L'){
        int rp = 0;
        int lp = 0;
        if(i >= 1){
          for(int x = i - 1;x >= 0;x--){
            if(s[x] == 'R'){
              rp++;
            }else{
              break;
            }
          }
        }
        ans[i] += rp / 2;
        ans[i+1] += rp - (rp / 2);
        if(i + 2 < len){
          for(int y = i + 2;y < len;y++){
            if(s[y] == 'L'){
              lp++;
            }else{
              break;
            }
          } 
        }
        ans[i] += lp - (lp / 2);
        ans[i+1] += lp / 2;
        ans[i]++;
        ans[i+1]++;
      }
    }
    for(int z = 0;z < len;z++){
      System.out.print(ans[z] + " " );
    }
  }
}