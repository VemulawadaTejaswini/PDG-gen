import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int count=0;
        int temp;
        for(int i=0;i<n;i++){
            temp=Integer.parseInt(st.nextToken());
            if(temp%2!=0){ count++; }
        }
        System.out.println((count%2==0) ? "YES":"NO");
    }
}
