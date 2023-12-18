import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        int cnt = 0;
        for(int i=1;i<=n;i++){

            if(i % 2 == 0)continue;
            int a = Integer.parseInt(temp[i-1]);

            if(a % 2 == 0)continue;

            cnt++;

        }
        System.out.println(cnt);
    }
}
