class Main {
  public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] lst = new long[N];
        for(int i = 0; i < N; i++){
            lst[i] = sc.nextInt();
        }
        sc.close();

        int cnt = 0;
        for(int i = 0; i < N -2; i++){
            for(int j = i + 1; j < N -1; j++){
                if( lst[i] == lst[j]){
                    continue;
                }
                for(int k = j + 1; k < N; k++){
                    if( lst[i] == lst[k] || lst[j] == lst[k]){
                        continue;
                    }
                    long c = lst[i] + lst[j] + lst[k];
                    if ( lst[i] * 2 < c && lst[j] * 2 < c && lst[k] * 2 < c ){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
  }
}