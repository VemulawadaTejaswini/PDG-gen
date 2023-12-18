import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      Long output = new Long(0);
      int N = sc.nextInt();
      if(N == 1){
        System.out.println(0);
        return;
      }else if(N == 2){
        System.out.println(1);
        return;
      }
      /*for(int i = 1; i <= N - 1; i++){
        output += i;
      }*/
      
      System.out.println(java.util.stream.LongStream.range(1, N).sum());
      //System.out.println();
	}
}
