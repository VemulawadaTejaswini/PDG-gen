import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n =Integer.parseInt(br.readLine());
    boolean[] arr = new boolean[n+1];
    String s = br.readLine();
    String[] str = s.trim().split("\\s+");
    TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
    for(int i=0;i<n-1;i++){
      //int a = sc.nextInt();
      int a = Integer.parseInt(str[i]);
      arr[a]=true;
      if(map.get(a)!=null){
        map.put(a, map.get(a)+1);
      }
      else{
        map.put(a,1);
        //arr.remove((Integer)a);
      }
    }
    for(int i=1;i<arr.length;i++){
      if(arr[i]==false){
        map.put(i,0);
      }
    }
    map.forEach((k, v) -> sb.append(v+"\n")); 
    System.out.print(sb);
  }
}