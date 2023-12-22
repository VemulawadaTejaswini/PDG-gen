import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int K = Integer.parseInt(sc.next());
	int ans = 0;
	for(int i = 1; i<=K ;i++){
		for(int j = 1; j<=K ;j++){
			for(int l = 1; l<=K ;l++){
				ans +=gcd(gcd(i,j),l);
			}
		}
	}
    System.out.print(ans);
    return;
  }

  static int gcd(int a, int b){
    int max= Math.max(a,b);
    int min= Math.min(a,b);
    if(max%min==0){
      return min;
    }else{
      return gcd(max%min, min);
    }
  }  
  
}


