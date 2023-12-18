import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
        String alf="abcdefghijklmnopqrstuvwxyz";
        long N=sc.nextLong();
        long defN=N;
        StringBuilder s = new StringBuilder("");
        int zerof=0;
        for(int i=13;i>=0;i--){
          int m=(int)(((N-(N%pow(i,26)))/pow(i,26)));
          if(zerof==1||m!=0){
          zerof=1;
          s.append(String.valueOf(alf.charAt(m-1)));
          }
          N=N%pow(i,26);
        }
      if(defN!=0){
        System.out.println(s.toString());
      }else{
        System.out.println("a");
      }
}
  public static long pow(int k,long n){
    long t=1;
    for(int i=0;i<k;i++){
      t=t*n;
    }
    return t;
  }
}