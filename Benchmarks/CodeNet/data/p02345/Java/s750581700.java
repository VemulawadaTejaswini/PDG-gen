import java.util.*;

class MainA {
  static int[] a;
  static final int INIT = 2147483647;
  static ArrayList<Integer> ansArr = new ArrayList<Integer>();

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();

    a = new int[n];
    for(int i = 0 ; i < n ; i++) {
      a[i] = INIT;
    }

    int com,x,y = 0;
    q=q-1;
    while(q != -1) {
      com = sc.nextInt();
      x = sc.nextInt();
      y = sc.nextInt();
      if(com == 0) {
        a[x] = y;
      } else ansArr.add(find(x, y));
      q--;
    }

    for(int ans: ansArr) System.out.println(ans);
	}

  static int find(int x, int y) {
    if(x == y) return a[x];
    int min = INIT;
    for(int i = x; i <= y; i++) {
      if (a[i] < min) {
        min = a[i];
      }
    }
    return min;
  }
}

