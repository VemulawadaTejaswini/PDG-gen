import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    Map<String,Integer>map = new TreeMap<String,Integer>();
    for(int i = 0;i < N;i++){
      map.put(scanner.next(),0);
    }
    System.out.println(map.size());
  }
}