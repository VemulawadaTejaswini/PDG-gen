import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int result = 0;
        for(int i=0;i<n;i++){
          int tmp = sc.nextInt();
          if(tmp >= max){
            result++;
            max = tmp;
          }
        }
      System.out.println(result);
	}
}