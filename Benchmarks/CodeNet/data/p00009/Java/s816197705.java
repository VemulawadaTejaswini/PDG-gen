import java.util.Scanner;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    String line;
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextLine()) {
      line = sc.nextLine();
      int n = Integer.parseInt(line);
      HashMap<Integer, Integer> not_prime = new HashMap<Integer, Integer>();
      int count_prime = 0;
      for(int i=2;i<=n;i++) {
        if(not_prime.containsKey(i)) {
          continue;
        }
        count_prime++;
        for(int j=i+i;j<=n;j+=i) {
          not_prime.put(j,1);
        } 
      }
      System.out.println(count_prime);
    }
  }
}