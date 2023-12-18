import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] temp = br.readLine().split(" ");

        int L = Integer.parseInt(temp[0]);
        int R = Integer.parseInt(temp[1]);
        int d = Integer.parseInt(temp[2]);

        int cnt = 0;
        for(int i=0;i<=R;i+=d){

            if(i < L)continue;

            cnt++;
        }

        System.out.println(cnt);
    }
}
