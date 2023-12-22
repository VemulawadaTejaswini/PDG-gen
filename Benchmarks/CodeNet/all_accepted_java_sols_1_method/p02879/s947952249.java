import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
      	int ans = 0;

      if(String.valueOf(N1).length()==1  && String.valueOf(N2).length()==1){
        ans = N1 * N2;
      
      }else{
      	ans= -1;
      }
		System.out.println(ans);
	}
}
