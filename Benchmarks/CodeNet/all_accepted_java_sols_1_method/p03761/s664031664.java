import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] a = new int[N][26];

        for(int i = 0; i<N; i++) {
            String str = sc.next();
            for(int c = 0; c<str.length(); c++) {
                a[i][(int)(str.charAt(c)-'a')]++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<26; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<N; j++) {
                min = Math.min(a[j][i], min);
            }
            while(min!=0) {
                builder.append(((char)('a'+i)));
                min--;
            }
        }
        System.out.println(builder.toString());

    }
}