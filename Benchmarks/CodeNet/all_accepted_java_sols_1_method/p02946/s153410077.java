import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
    int b = scan.nextInt();
    
    for(int i = b-(a-1) ; i<=b+(a-1) ; i++){
      System.out.println(i);
    }
  }
}
