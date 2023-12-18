import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int len = sc.nextInt();
      Long[] goukei = new Long[len];
      Long kouhuku = new Long(0);
      for(int i = 0; i < len; i++){
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        goukei[i] = a + b;
        kouhuku -= b;
      }
      Arrays.sort(goukei,Collections.reverseOrder());
      for(int i = 0; i < len; i = i + 2){
        kouhuku += goukei[i];
      }
      System.out.println(kouhuku);
	}
}
