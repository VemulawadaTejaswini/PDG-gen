import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int ans[] = new int[n];
    int c = y-x;
    int d;
    for(int i = 1; i < n; i++){
      for(int j = n; j > i; j--){
        d = j-i;
        if(i<=x&&y<=j){
          ans[x-i+j-y+1]++;
        } else if(i<=x&&j<y){
          if(d < x-i+1+y-j){
            ans[d]++;
          } else {
            ans[x-i+1+y-j]++;
          }
        } else if(x<i&&i<y&&y<=j){
          if(d < i-x+j-y+1){
            ans[d]++;
          } else {
            ans[i-x+j-y+1]++;
          }
        } else if(x<i&&i<y&&j<y){
          if(d < i-x+1+y-j){
            ans[d]++;
          } else {
            ans[i-x+1+y-j]++;
          }
        } else {
          ans[d]++;
        }
      }
    }
    for(int i = 1; i < n; i++){
      System.out.println(ans[i]);
    }
  }
}