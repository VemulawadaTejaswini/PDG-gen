class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useDelimiter("\\D");
        int w = s.nextInt();
        int n = s.nextInt();
        int[] l = new int[w];
        for(int i = 0; i < w; ++i) {
            l[i] = i + 1;
        }
        for(int i = 0; i < n; ++i) {
            int a = s.nextInt();
            int b = s.nextInt();
            int t = l[a - 1];
            l[a - 1] = l[b - 1];
            l[b - 1] = t;
        }
        for(int i : l) {
            System.out.println(i);
        }
    }
}