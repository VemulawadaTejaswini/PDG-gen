import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int th = Integer.parseInt(st.nextToken());
        int ts = Integer.parseInt(st.nextToken());
        int ah = Integer.parseInt(st.nextToken());
        int as = Integer.parseInt(st.nextToken());

        int tnum = ah%ts==0?ah/ts:(ah/ts) +1;
        int anum = th%as==0?th/as:(th/as) +1;
        String ans = tnum>anum? "No":"Yes";
        System.out.println(ans);
        

    }
}