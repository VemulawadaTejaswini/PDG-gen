import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=0,res=0;
    Map<Integer,Integer> m=new TreeMap<>();
    for(int i=0;i<n;i++)m.put(sc.nextInt(),sc.nextInt());
    for(int key:m.keySet()){
        count++;
        if(count==n) {
        	res=key+m.get(key);
        }
      }
    System.out.println(res);
  }
}
