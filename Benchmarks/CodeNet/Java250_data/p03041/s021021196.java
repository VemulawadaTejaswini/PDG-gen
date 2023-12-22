import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
		String S = sc.next();
		
        for(int i=0;i<N;i++){
          if (i+1 == K){
            String tmp = (S.substring(i,i+1));
            System.out.print(tmp.toLowerCase());
          }else{
            System.out.print((S.substring(i,i+1)));
          }
        }
	}
}