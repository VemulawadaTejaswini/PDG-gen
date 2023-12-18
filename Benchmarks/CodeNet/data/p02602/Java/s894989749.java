import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int score[] = new int[n];
    for(int i=0;i<n;i++){
		score[i] =  Integer.parseInt(sc.next());
    }
    
    //出力
	for(int r = k; r<n;r++){
      int l=r-k;
      if(score[l] < score[r]){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}
}