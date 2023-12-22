import java.io.*;

public class Main {

  static int n, a, b, c;
  static int[] d, ord, ans;

  static String[] ordStr;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    d = new int[3];

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    a = Integer.parseInt(in[1]);
    b = Integer.parseInt(in[2]);
    c = Integer.parseInt(in[3]);
    d[0] = a;
    d[1] = b;
    d[2] = c;

    ord = new int[n];
    ordStr = new String[n];

    for(int i = 0; i < n; i++){
      ordStr[i] = br.readLine();
      if(ordStr[i].equals("AB")) ord[i] = 2;
      if(ordStr[i].equals("AC")) ord[i] = 1;
      if(ordStr[i].equals("BC")) ord[i] = 0;
    }

    br.close();

    ans = new int[n];

    long sum = a + b + c;

    PrintWriter out = new PrintWriter(System.out);

    boolean ok = true;

    if(sum == 0){
      ok = false;
    }else if(sum == 1){

      for(int i = 0; i < n; i++){
        if(d[ord[i]] == 1){
          ok = false;
          break;
        }else{
          for(int th = 0; th < 3; th++){
            if(th == ord[i]) continue;
            if(d[th] == 0) ans[i] = th;
            d[th] = 1 - d[th];
          }
        }
      }
    }else if(sum == 2){
      for(int i = 0; i < n; i++){
        int ord1 = 0;
        int ord2 = 1;
        if(ord[i] == 0) {
          ord1 = 2;
        }else if(ord[i] == 1){
          ord2 = 2;
        }

        if(d[ord1] + d[ord2] == 0){
          ok = false;
          break;
        }

        if(d[ord1] < d[ord2]){
          d[ord2]--;
          d[ord1]++;
          ans[i] = ord1;
        }else if(d[ord1] > d[ord2]){
          d[ord1]--;
          d[ord2]++;
          ans[i] = ord2;
        }else{
          if(i == n - 1) continue;
          if(ord[i+1] == ord[i]){
            d[ord1]++;
            d[ord2]--;
            ans[i] = ord1;
          }else if(ord[i+1] == ord1){
            d[ord1]--;
            d[ord2]++;
            ans[i] = ord2;
          }else{
            d[ord2]--;
            d[ord1]++;
            ans[i] = ord1;
          }
        }
      }
    }else{
      for(int i = 0; i < n; i++){
        int ord1 = 0;
        int ord2 = 1;
        if(ord[i] == 0) {
          ord1 = 2;
        }else if(ord[i] == 1){
          ord2 = 2;
        }

        if(d[ord1] + d[ord2] == 0){
          ok = false;
          break;
        }

        if(d[ord1] < d[ord2]){
          d[ord2]--;
          d[ord1]++;
          ans[i] = ord1;
        }else{
          d[ord1]--;
          d[ord2]++;
          ans[i] = ord2;
        }
      }
    }


    if(ok){
      out.println("Yes");
      for(int i = 0; i < n; i++){
        out.println((char)('A' + ans[i]));
      }
    }else{
      out.println("No");
    }

    out.flush();

  }

}