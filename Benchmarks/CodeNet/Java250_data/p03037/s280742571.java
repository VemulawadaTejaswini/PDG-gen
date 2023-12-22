import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main{
  public static void main(String[] args){
    try{
    BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
    String as = re.readLine();
    String aa[] = as.split(" ");
    String aaa = aa[0];
    String bbb = aa[1];  
    int a = Integer.parseInt(aaa);
    int b = Integer.parseInt(bbb);
    int[][] c = new int[b][2];
    int ans = 0;
    int max = 0;
    int min = 0;  
    for(int i = 0;i < b;i++){
      String al = re.readLine();
      String bb[] = al.split(" ");
      String ccc = bb[0];
      String ddd = bb[1];  
      c[i][0] = Integer.parseInt(ccc);
      c[i][1] = Integer.parseInt(ddd);      
    }
      for(int x = 0;x < b;x++){
        if(c[x][0] > max) max = c[x][0];
        if(c[x][1] < min || x == 0) min = c[x][1];
      }  
    for(int x = 1;x <= a;x++){
      if(x >= max && x <= min) ans++;
    }
    System.out.println(ans);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}