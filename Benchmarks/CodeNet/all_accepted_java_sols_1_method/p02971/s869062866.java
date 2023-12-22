import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
       
      ArrayList <Integer> a = new ArrayList <Integer>();
 	  int n[] = new int[N];
      for(int i=0; i<N; i++){
         n[i] =scanner.nextInt();
      	 a.add(n[i]);//[1.4.3]の入力が入る
      }
  
      Collections.sort(a);
  
  	  for(int i=0; i<N; i++){
         int max = a.get(a.size()-1);//aの最大値
         int max2 = a.get(a.size()-2);//aの二番目に大きい数値
      if(max==n[i]){//最大値がn[i]番目の数値と同じならば,出力は二番目に大きい数値を表す
                    //[1,3,4]でmax[4]とn[i]==n[2]...(4)が同じならば,[1,3]を比較してmax2==3を出力している
        System.out.println(max2);
      }
      else{
        System.out.println(max);
      }
      }
}
}