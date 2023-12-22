import java.io.*;
import java.util.*;
class Main{
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    // String [][] dic = new String[n][2];
    Set<String> dic = new HashSet<>();
    String str[] =new String[2];
    int j;
    for(int i = 0; i<n; i++){
      str = br.readLine().split("\\s+");
      if(str[0].charAt(0)=='i'){
        dic.add(str[1]);
      }else{

        if(dic.contains(str[1])){
          System.out.println("yes");
        }else{
          System.out.println("no");
        }
      }
    }
  }
}
