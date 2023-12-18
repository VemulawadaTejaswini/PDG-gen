import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int prev = Integer.parseInt(st.nextToken());
        int len = 1;
        int max = 1;
        for(int i=1 ; i<n ; i++) {
            int curr = Integer.parseInt(st.nextToken());
            if(curr <= prev) {
                len++;
            }
            else {
                if(len > max) {
                    max = len;
                }
                len = 1;
            }
            prev = curr;
        }

        if(len > max) {
            max = len;
        }

        System.out.println(max-1);
    }
}
