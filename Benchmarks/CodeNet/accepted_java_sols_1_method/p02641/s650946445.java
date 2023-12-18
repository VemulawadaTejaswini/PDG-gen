import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
    int n = sc.nextInt();
    ArrayList<Integer> p = new ArrayList<Integer>();
    boolean f = true;
    if(n == 0) f = false;

    for(int i=0; i<n; i++) {
      int tmp = sc.nextInt();
      p.add(tmp);
    }

    Collections.sort(p);
    int ans = 101;
    for(int i=0; i<102; i++) {
      if(p.contains(i)) continue;
      //System.out.println(Math.abs(x-i));
      ans = Math.min(ans, Math.abs(x-i));
      //System.out.println(ans);
    }

    if(f = true) {
      if(p.contains(x-ans)) {
        System.out.println(x+ans);
      } else {
        System.out.println(x-ans);
      }
    } else {
      System.out.println(x);
    }

	}
}
