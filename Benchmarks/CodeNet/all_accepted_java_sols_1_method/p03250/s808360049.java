import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
 	int x = scan.nextInt();
    int z = scan.nextInt();
    List<Integer> l = new ArrayList<>() ;
    l.add(x);
    l.add(z);
    l.add(n);
	Collections.sort(l, Collections.reverseOrder());
    
    String s = l.get(0)+"" ;
    s = s.concat(l.get(1)+"");
    System.out.println(Integer.parseInt(s)+l.get(2));
    
    
    
  }
}
