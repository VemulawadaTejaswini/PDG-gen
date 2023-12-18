import java.util.*;

class MainB {
    static int[] a;
    static ArrayList<Integer> ansArr = new ArrayList<Integer>();
    static int N = 1;

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int q = sc.nextInt();

      while(N <= n) N *= 2;
      a = new int[2*N - 1];

      int com,x,y = 0;
      for(int i = 0 ; i < q ; i++) {
          com = sc.nextInt();
          x = sc.nextInt();
          y = sc.nextInt();
          if(com == 0) add(x, y);
          else ansArr.add(getSum(x, y, 0, 0, N-1));
      }

      for(int ans: ansArr) System.out.println(ans);
    }

    static void add(int x,int y) {
      x += N-1;
      a[x] += y;
      while(x > 0) {
        x = (x - 1)/2;
        a[x] = a[2*x+1] + a[2*x+2];
      }
    }

    static int getSum(int x, int y, int i, int l, int r) {
      if (r < x || y < l)
        return 0;
      if (x <= l && r <= y){
        return a[i];
      }else {
        int vl = getSum(x, y, i*2+1, l, (l+r)/2);
        int vr = getSum(x, y, i*2+2, (l+r+1)/2, r);
        return vl+vr;
      }
    }
}

