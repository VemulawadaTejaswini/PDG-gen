import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      Long K = sc.nextLong();
      Long A = sc.nextLong();
      Long B = sc.nextLong();
      if(B - A <= 2 || K <= A){
        System.out.println(1 + K);
      }else{//A出現ごとにBに変換
        Long nokori = K - (A - 1);
        Long addBisuke = A + (B - A) * (nokori / 2);
        if(nokori % 2 == 1){//ビスケット1回たたく
          addBisuke++;
        }
        System.out.println(addBisuke);
      }
	}
}
