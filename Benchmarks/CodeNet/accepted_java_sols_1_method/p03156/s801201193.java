class Main {
    public static void main(String[] args)  {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = Integer.parseInt(sc.next()),  A = Integer.parseInt(sc.next()), B = Integer.parseInt(sc.next()), times = 0, i, t = N / 3;
        java.util.List<Integer> P = new java.util.ArrayList<>();
        for(i = 0; i < N; i++) P.add(Integer.parseInt(sc.next()));
        for(int j = 0; j < t; j++) {
            for(i = 0; i < N; i++) {
                if(P.get(i) <= A) {
                    P.remove(i);
                    break;
                }
            }
            if(i == N--) break;
            for(i = 0; i < N; i++) {
                int tmp = P.get(i);
                if(A+1<=tmp&&tmp<=B) {
                    P.remove(i);
                    break;
                }
            }
            if(i == N--) break;
            for(i = 0; i < N; i++) {
                if(B+1<=P.get(i)) {
                    P.remove(i);
                    break;
                }
            }
            if(i == N--) break;
            times++;
        }
        System.out.println(times);
    }
}
