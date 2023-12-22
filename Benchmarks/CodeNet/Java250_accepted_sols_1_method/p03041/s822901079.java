import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
		String S = sc.next();
		
        for(int i=0;i<N;i++){
          if (i+1 == K){
            System.out.print(Character.toLowerCase(S.charAt(i)));
          }else{
            System.out.print(S.charAt(i));
          }
        }
	}
}