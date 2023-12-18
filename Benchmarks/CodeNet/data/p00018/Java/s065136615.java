import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] data=new int[5];
        for(int i=0;i<5;i++){
            data[i]=Integer.parseInt(st.nextToken());
        }Arrays.sort(data);
        for(int i=4;i>0;i--){
            System.out.print(data[i]+" ");
        }System.out.println(data[0]);
    }
}