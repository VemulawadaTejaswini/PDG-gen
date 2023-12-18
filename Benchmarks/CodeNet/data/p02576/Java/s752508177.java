class Solution {
 
  public static void main(String[] args) {
  	try(Scanner sc = new Scanner(System.in)) {
      int n,x,t;
      n = sc.nextInt();
      x = sc.nextInt();
      t = sc.nextInt();
      if(n%x == 0) {
        System.out.println(n*t/x);
      } else {
        System.out.println(n*t/x + t);
      }
    }
  }
}