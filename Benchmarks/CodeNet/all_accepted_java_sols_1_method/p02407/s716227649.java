import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] array=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            array[i]=Integer.parseInt(st.nextToken());
        }for(int i=1;i<=n;i++){
            System.out.print(array[n-i]);
            if(i!=n) System.out.print(" ");
        }System.out.println();
    }
}