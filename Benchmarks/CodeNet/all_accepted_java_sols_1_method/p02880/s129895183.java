import java.util.Scanner;
public class Main{
   public static void main(String[]args){
    
   Scanner sc = new Scanner(System.in);
  
     //入力
     int N = sc.nextInt();
     //int kuku1 =new int[81];
    
     //九九でだせる数字を求めてNと合えば出力
     //int idx = 0;
     for(int i=1; i<=9; i++){
         for(int j=1; j<=9; j++){
           if((i*j)==N){
              System.out.print("Yes");
             return;
         }
            //int kuku2 = i*j;
            //kuku1[idx] = sc.nextInt();
            //kuku1[idx] = kuku2;
            //idx = idx + 1;
            //String kuku2 = String.valueOf(kuku);
            //System.out.println(int[kuku2]);
            }  
     }
     System.out.println("No");
 
     // 九九の中にNが含まれるか？
     
     //九九で表せる数字かどうか
     //System.out.println(kuku2.contains(N) ? "Yes":"No");
   }
}