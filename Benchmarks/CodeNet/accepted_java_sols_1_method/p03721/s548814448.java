import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    long k = scan.nextLong();
    HashMap<Integer,Long> a = new HashMap<Integer,Long>();
    HashSet<Integer> d = new HashSet<Integer>();
    for (int i=0;i<n;i++){
        int b = scan.nextInt();
        long c = scan.nextLong();
        d.add(b);
        if (a.get(b) == null){
          a.put(b,c);
        }
        else{
          long g = a.get(b);
          a.put(b,g+c);
        }
    }

    ArrayList<Integer> e = new ArrayList<Integer>(d);
    Collections.sort(e);

    long sum = 0;
    int count = 0;
    int g = 0;
    while (sum < k){
      g = e.get(count);
      long much = a.get(g);
      sum += much;
      count += 1;
    }

    System.out.print(g);


  }

}
