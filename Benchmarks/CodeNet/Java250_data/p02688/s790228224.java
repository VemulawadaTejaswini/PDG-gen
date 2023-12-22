import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer d[] = new Integer[k];
        Set<Integer> num = new HashSet<>();

        for( int i=0; i<k; i++ ){
            d[i] = sc.nextInt();
            Integer a[][] = new Integer[k][d[i]];

            for( int j=0; j<d[i]; j++ ){
                 a[i][j] = sc.nextInt();
                 num.add(a[i][j]);
            }
        }

        System.out.println( n-num.size() );

    }
}