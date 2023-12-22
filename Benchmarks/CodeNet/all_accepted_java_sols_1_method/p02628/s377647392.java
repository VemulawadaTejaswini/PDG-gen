import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String[] NK = bf.readLine().split(" ");
    int N = Integer.parseInt(NK[0]);
    int K = Integer.parseInt(NK[1]);
    String[] P = bf.readLine().split(" ");
    List<Integer> l = new ArrayList<Integer>();
    for (String s : P ) {
      l.add(Integer.parseInt(s));
    }
    l.sort(Comparator.naturalOrder());

    int sum = 0;
    for (int i = 0 ; i < K; i++) {
      sum = sum + l.get(i);
    }
    System.out.println(sum);
  }
}