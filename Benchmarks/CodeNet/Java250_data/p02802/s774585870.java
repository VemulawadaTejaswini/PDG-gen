import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[][] list = new int[N][2];//list[問題番号][0] == AC用//list[問題番号][1] == WA用
      int AC =0;//最終的なAC数を収める変数
      int WA =0;//最終的なWA数を収める変数
      for(int i = 0; i < M; i++){
        int num = sc.nextInt();
        String s = sc.next();
        if(s.equals("AC") && list[num-1][0]!=1){
          list[num-1][0] = 1;
          AC++;
          WA += list[num-1][1];//対象の問題の最終的なWAの数をWAに格納
        }else if(s.equals("WA") && list[num-1][0]!=1){
          list[num-1][1]++;
        }
      }      
      System.out.println(AC+" "+WA);
    }
}