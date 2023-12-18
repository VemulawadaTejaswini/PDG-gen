import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int n=N;
        int L = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        int k=0;
        while(N--!=0){
            arr[k++] = br.readLine();
        }
        Arrays.sort(arr);
        String ans="";
        for(int i=0; i<n; i++){
            ans+=arr[i];
        }

        System.out.println(ans);

    }
}