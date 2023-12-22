import java.util.Scanner;
class Main{
 public static void main(String args[]){
  Scanner scan = new Scanner(System.in);
  
  int n = scan.nextInt();
  int sup[] = new int[n+1];
  int ans[] = new int[n+1];
   ans[1] = 0;
  for(int i = 2; i<=n; i++){ //初期化
    sup[i] = scan.nextInt();
    ans[i] = 0;
  }
  for(int i = 2; i<= n; i++){
    ans[sup[i]]++;
  }
  for(int i = 1; i<= n; i++){
    System.out.println(ans[i]);
  }
 }
}
