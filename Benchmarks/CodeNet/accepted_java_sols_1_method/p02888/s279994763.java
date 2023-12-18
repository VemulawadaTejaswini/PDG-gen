import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int L[] = new int[N];
        for (int i=0; i<N; i++) {
            L[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Arrays.sort(L);

        int cnt = 0;
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for (int k=j+1; k<N; k++) {
                    int a = L[i];
                    int b = L[j];
                    int c = L[k];
                    if ((c<a+b) && (a<b+c) && (b<c+a)) {
                        cnt++;
                    } else {
                        break;
                    }
                }
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(cnt);
        out.flush();
    }
}