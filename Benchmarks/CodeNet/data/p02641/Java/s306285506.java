import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        HashSet<Integer> num = new HashSet<>();
        int c=1;
        int temp1=x;
        int temp2=x;
        if(n==0){
            System.out.println(x);
        }
        else {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                num.add(Integer.parseInt(st.nextToken()));
            }
            for(c=0;c<n+1;c++) {
                temp1 = x + c;
                temp2 = x - c;
                if (!num.contains(temp2)) {
                    System.out.println(temp2);
                    break;
                }
                if (!num.contains(temp1)) {
                    System.out.println(temp1);
                    break;
                }
            }

        }
    }
}
