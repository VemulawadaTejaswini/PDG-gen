import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      String[] ccc = new String[lng];
      String[] cc = new String[lng];



      int cnt = 0;

      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
        ccc[i] = String.valueOf(c[i]);
      }

      int flag = 0;

      for(int i=0;i<lng-1;i++){
        if(i==0){
          cc[cnt] = ccc[i];
        }
        else{
          if(cc[cnt-1].equals(ccc[i])){
            cc[cnt] = ccc[i] + ccc[i+1];
            if(i==lng-2){flag = 1;}
            i++;
          }
          else{
            cc[cnt] = ccc[i];
          }
        }
        cnt++;
      }

      int ans = 0;

      if(!(cc[cnt-1].equals(ccc[lng-1])) && flag == 0){
        ans++;
      }

      for(int i=0;i<lng;i++){
        if(cc[i] != null){
          ans++;
        }
      }

      System.out.println(ans);
    }
}
