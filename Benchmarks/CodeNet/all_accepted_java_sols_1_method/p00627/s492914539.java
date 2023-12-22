import java.util.*;
public class Main {
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt(),sum=0;
			if(n==0) break;
			for(int i=0;i<n/4;++i){
				sum+=sc.nextInt();
			}
			System.out.println(sum);
		}
	}
}