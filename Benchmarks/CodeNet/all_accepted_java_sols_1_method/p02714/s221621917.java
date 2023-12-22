import java.io.*;

public class Main {

  static long n, ans;
  static String s;
  static int[] rgb = new int[3];

  static char[] c = {'R', 'G', 'B'};

  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);
    s = br.readLine();

    br.close();

    ans = n * (n-1) * (n-2) / 6;
    long sub = 0;
    long add = 0;

    for(int i = 0; i < n; i++){
      for(int j = 1; j < n; j++){
        if(i + 2*j >= n) break;
        
        ans--;
      }
    }

    for(int i = 0; i < n; i++){
      if(s.charAt(i) == 'R') rgb[0]++;
      if(s.charAt(i) == 'G') rgb[1]++;
      if(s.charAt(i) == 'B') rgb[2]++;
    }

    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
        if(s.charAt(i) != s.charAt(j)) continue;

        char now = s.charAt(i);
        
        int idx = 0;
        if(now == 'G') idx = 1;
        if(now == 'B') idx = 2;

        ans -= n-2;
        sub += (rgb[idx] - 2);
        
        if(2*i - j >= 0){
          if(s.charAt(2*i-j) == now)
            add++;
          else
            ans++;
        }
        if(2*j - i < n){
          if(s.charAt(2*j-i) == now)
            add++;
          else
            ans++;
        }
        if((j - i) % 2 == 0){
          if(s.charAt(i + (j-i)/2) == now)
            add++;
          else
            ans++;
        }
      }
    }

    System.out.println(ans + 2 * sub / 3 + add/3);

  }
}