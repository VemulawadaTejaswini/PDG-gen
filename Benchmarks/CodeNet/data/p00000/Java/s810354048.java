class Main {
    private static void solve() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(String.format("%dx%d=%d", i, j, i * j));
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}