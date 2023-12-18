import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");
    int[] relation = new int[n];
    int[] answer = new int[n];
    for(int i = 0; i < line.length; i++){
      int boss = Integer.parseInt(line[i]) - 1;
      relation[i + 1] = boss;
    }
    for(int i = n - 1; i > 0; i--){
      answer[relation[i]]++;
    }
    for(int a : answer){
      System.out.println(a);
    }
  }
}