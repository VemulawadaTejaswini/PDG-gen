import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String Q[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
      int P = Arrays.asList(Q).indexOf(S); //Arrays.aslist → 配列をリスト化
      System.out.println(7-P);
    }
}      