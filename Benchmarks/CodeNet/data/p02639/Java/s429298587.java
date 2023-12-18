class Main{
    final static long INF = Long.MAX_VALUE / 2;
    final static int MOD = 1_000_000_007;
    final static int SIZE = 1_000_000;
    long[] fac = new long[SIZE];
    long[] inv = new long[SIZE];
    long[] finv = new long[SIZE];
    FastScanner sc = new FastScanner();

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){

        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            if(a == 0){
                System.out.println(i + 1);
                System.exit(0);
            }
        }

    }

}
