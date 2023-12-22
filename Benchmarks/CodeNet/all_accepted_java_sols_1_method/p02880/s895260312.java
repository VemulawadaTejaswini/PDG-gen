import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
      //入力
     int N = sc.nextInt();
     //九九リストを用意する
     List<Integer> kukulist = new ArrayList<>();
    
     //リストに九九を追加していく
     for(int i=1; i<=9; i++){
         for(int j=1; j<=9; j++){
            kukulist.add(i*j);
            }
     }
     //九九で表せる数字かどうか
     System.out.println(kukulist.contains(N) ? "Yes":"No");
   }
}