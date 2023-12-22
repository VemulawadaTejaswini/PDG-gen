import java.util.*;
import java.io.*;

class Main{
  static boolean found = false;
  public static void main(String[] args) throws IOException {
    PrintWriter out = new PrintWriter(System.out);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st  = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    
    st  = new StringTokenizer(br.readLine());

    int[] arr = new int[N];

    for (int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    long ans = 0;

    for (int i=1; i<N; i++) {
      if(arr[i]<arr[i-1]){
        ans+=arr[i-1]-arr[i];
        arr[i] = arr[i-1];
      }
    }

    out.println(ans);

    out.close();
  }

  
}








