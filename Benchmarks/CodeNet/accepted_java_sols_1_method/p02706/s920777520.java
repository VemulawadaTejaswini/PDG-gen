import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int natudays = sc.nextInt();
      	int ii=sc.nextInt();
      int[] hairetu=new int[ii];
      for(int i=0;i<ii;i++){
        hairetu[i]=sc.nextInt();
      }
      int k=0;
      for(int i=0;i<hairetu.length;i++){
        k+=hairetu[i];
      }
      int ans=natudays-k;
      if(ans<0){
        ans=-1;
      }
      System.out.println(ans);
	}
}