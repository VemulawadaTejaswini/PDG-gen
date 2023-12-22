import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] data=new int[3];
        data[0]=Integer.parseInt(st.nextToken());
        data[1]=Integer.parseInt(st.nextToken());
        data[2]=Integer.parseInt(st.nextToken());
        Arrays.sort(data);
        System.out.println(data[0]+" "+data[1]+" "+data[2]);
    }
}