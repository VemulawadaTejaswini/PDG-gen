import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      int[] a = new int[N];
      int[] sum = new int[N];
      Arrays.fill(sum, 0);
      int i=0;
      int j=0;
      for(i=0;i<N;i++){
        a[i] = sc.nextInt();
      }
      ArrayList<Integer> intList = new ArrayList<Integer>();
      int ssum=0;
      for(i=N-1;i>=0;i--){
        ssum=0;
        for(j=1;j*(i+1)<=N;j++){
          ssum=ssum+sum[j*(i+1)-1];
        }
        if(a[i]==1&&ssum%2==0){
          intList.add(i+1);
          sum[i]=1;
        }else if(a[i]==0&&ssum%2==1){
          intList.add(i+1);
          sum[i]=1;
        }
      }
      System.out.println(intList.size());
      for(int k:intList){
        System.out.print(k+" ");
      }
    }
}