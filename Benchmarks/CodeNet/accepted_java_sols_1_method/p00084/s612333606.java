import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String tmp = br.readLine();
       int cnt = 0;
       String[] ans = new String[1024];
       char[] s = tmp.toCharArray();
       for(int i=0;i<s.length;i++){
           if(s[i] == ',' || s[i] == '.')  s[i]= ' ';
       }
       tmp = String.valueOf(s);
       String[] data = tmp.split(" ");
       for(int i=0;i<data.length;i++){
           if(data[i].length() > 2 && data[i].length() < 7) {
               ans[cnt] = data[i];
               cnt++;
           }
       }
       for(int i=0;i<cnt;i++){
          if(i == cnt-1) System.out.println(ans[i]);
          else System.out.print(ans[i] + " ");
       }
   }
}