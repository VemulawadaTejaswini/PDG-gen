import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();
    int r = scan.nextInt();
    int s = scan.nextInt();
    int p = scan.nextInt();
    String t = scan.next();

    ArrayList<ArrayList<Character>> a = new ArrayList<ArrayList<Character>>();
    for (int i=0;i<k;i++){
      ArrayList<Character> b = new ArrayList<Character>();
      a.add(b);
    }

    for (int i=0;i<n;i++){
      int target = (int) i%k;
      ArrayList<Character> c = a.get(target);
      char g = t.charAt(i);
      if (g == 'r'){
        g = 'p';
      }
      else if (g == 's'){
        g = 'r';
      }
      else{
        g = 's';
      }
      c.add(g);
    }

    long sum = 0;
    for (int j=0;j<k;j++){
      ArrayList<Character> e = a.get(j);
      char prev = 'a';
      for (char m : e){
        if (m != prev){
          if (m == 'r'){
            sum += r;
          }
          else if (m == 's'){
            sum += s;
          }
          else{
            sum += p;
          }
          prev = m;
        }
        else{
          prev = 'a';
        }
      }
    }
    System.out.println(sum);
  }

}
