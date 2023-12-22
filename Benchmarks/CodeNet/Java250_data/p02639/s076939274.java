import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        ArrayList<Integer> num=new ArrayList<>();
        int c=1;
        while (st.hasMoreTokens()){
            int temp=Integer.parseInt(st.nextToken());
            if(temp==0)
                break;
            c++;
        }
        System.out.println(c);
    }
}
