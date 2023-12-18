import java.util.*; 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = Integer.parseInt(sc.next());
	int q = Integer.parseInt(sc.next());
    int r = Integer.parseInt(sc.next());
	
    System.out.print(Math.min(Math.min(p+q, p+r), q+r));
  }
}
  
