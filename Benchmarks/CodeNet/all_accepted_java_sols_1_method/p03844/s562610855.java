import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
    char op = scan.next().charAt(0);
    int B = scan.nextInt();
    if(op == '+'){
      System.out.println(A+B);
    }else{
      System.out.println(A-B);
    }

  }
}
