import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int tap = sc.nextInt();
      int over = sc.nextInt();
      int outlet = 1;
      int ans = 0;
        while (outlet < over) {
          --outlet;
          outlet += tap;
          ans++;
        }
        System.out.println(ans);

    }
}