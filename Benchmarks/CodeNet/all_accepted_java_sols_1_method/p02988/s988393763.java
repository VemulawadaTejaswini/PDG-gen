import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
 
      //入力
      int N =sc.nextInt();//数字の個数
      int p[] =new int[N];//順列
      int count =0;
      
      //順列が入力される
      for(int i =0; i<N; i++){
      	  p[i] =sc.nextInt();        
      }
      
      //0番目とN番目を除いてループする
      //2番目に小さい数字をカウントしていく
      for(int i =1; i<N-1; i++){
        
      	if(p[i-1]<p[i] && p[i]<p[i+1]){
          count++;
        }
        else if(p[i-1]>p[i] && p[i]>p[i+1]){
          count++;
        }
      }
        System.out.println(count);
    }
}