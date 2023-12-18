import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //学期(総合)
    int n = sc.nextInt();
    //学期(評定を始める基準)
    int k = sc.nextInt();
    //点数
    int[] score = new int[n];
    for(int i = 0; i < n;i++){
      score[i] = sc.nextInt();
    }
    int st = 1;
      //基準
      for(int i = 0;i < k;i++){
        st = st * score[i];
      }
      
      for(int i = 0;i < n - k;i++){
        int ans = 1;
        for(int j = 1 + i;j <= k + i;j++){
          ans = ans * score[j];
        }
        if(ans > st){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
  }
}