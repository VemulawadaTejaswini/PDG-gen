import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
      int[] hairetu=new int[b];
        for(int i=0;i<hairetu.length;i++){
          int c=sc.nextInt();
          hairetu[i]=c;
        }
      int count=0;
      int champ=hairetu[0];
      for(int k=0;k<hairetu.length;k++){
        if(champ>=hairetu[k]){
          champ=hairetu[k];
          count++;
        }
      }
      System.out.println(count);
	}
}