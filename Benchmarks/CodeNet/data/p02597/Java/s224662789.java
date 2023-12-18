import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        ArrayList<Integer> w_idx = new ArrayList<>();
        ArrayList<Integer> r_idx = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'W') w_idx.add(i);
            else r_idx.add(i);
        }

        int ans = 0;
        for(int a=0, b=r_idx.size()-1; a<w_idx.size() && b>=0;a++, b--){
            if(w_idx.get(a) < r_idx.get(b)){
                ans += 1;
            }else break;
        }
        bw.write(ans+"");


        bw.flush();
        bw.close();
        br.close();
    }
}
