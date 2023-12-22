import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

 long s = scan.nextLong();
    long d = scan.nextLong();
    //System.out.println(s+d);
    if(( s+d)  % 2 == 0){
      System.out.println((s+d)/2);
    }else{
      System.out.println("IMPOSSIBLE");
    }
    
  }
}