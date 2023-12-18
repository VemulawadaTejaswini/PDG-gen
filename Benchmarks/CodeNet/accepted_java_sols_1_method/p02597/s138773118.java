import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String s = br.readLine();
    int R=0;
    int W=0;
    for(int i=0; i<N; i++){
        if(s.charAt(i)=='R') R++;
        else W++;
    }
    int ans = 0;
    for(int i=0; i<R; i++) if(s.charAt(i)=='W') ans++;
    System.out.println(ans);
}
}