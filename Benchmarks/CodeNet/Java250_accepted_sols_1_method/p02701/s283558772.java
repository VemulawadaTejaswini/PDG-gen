import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ans = 1;
        String[] dic = new String[ n ];

        for( int i=0; i<n; i++ ){
           dic[i] = sc.next();
        }
        sc.close();
        Arrays.sort(dic);

        for( int j=0; j<n-1; j++ ){
            if( dic[ j ].equals( dic[ j+1 ] ) ){
            }else{
                ans++;
            }
        }
        System.out.println(ans);
    }
}