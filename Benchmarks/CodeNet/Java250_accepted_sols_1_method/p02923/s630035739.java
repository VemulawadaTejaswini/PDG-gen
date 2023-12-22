import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      
      int a[] = new int[N];
      
      int count = 0;
      int max = 0;
      for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
      }
       for(int i=1; i<N; i++){
        if(a[i-1]>=a[i]){
        count++;
        }
         else{
         max = Math.max(max,count);//maxにcount++されたものが入っていく,どんどん更新されていき最大値のcount++のものが残る
           count =0;//一旦リセットして,for文をまわして新しいcount++を更新していく
         }
       }
      max = Math.max(max,count);//elseに行かなかった場合(入力が3,2,1)
         System.out.println(max);
    }
}