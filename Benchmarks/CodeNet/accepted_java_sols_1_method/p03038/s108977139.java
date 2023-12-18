import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int m = sc.nextInt();
      int a[] = new int[n];
      Map<Integer, Integer> map = new HashMap<>();
      int b=0;
      Integer c[] = new Integer[m];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
	   }
      Arrays.sort(a);
       for(int j=0;j<m;j++){
        b = sc.nextInt();
        c[j] = sc.nextInt();
        if(map.containsKey(c[j])){
          map.put(c[j], map.get(c[j])+b);
        }else{
          map.put(c[j],b);
        }
	   }
      Arrays.sort(c, Collections.reverseOrder());
      int k = 0;
      int kk = 0;
      int before = 0;
      for(Integer max:c){
        for(kk=0;max!=before&&k<n && kk<map.get(max)&&max>a[k];kk++){
          a[k]=max;
          k++;
        }
        before = max;
      }
      long sum =0;
      for(int ap:a){
        sum+=ap;
      }
      System.out.println(sum);
    }
}