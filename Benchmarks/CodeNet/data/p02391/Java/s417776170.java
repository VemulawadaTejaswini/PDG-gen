class Main{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int a = Integer.parseInt(in.next());
    int b = Integer.parseInt(in.next());
    if (a > b){
      System.out.println(a + " > " + b);
    }
    if (a == b){
      System.out.println(a + " == " + b);
    }
    if (a < b){
      System.out.println(a + " < " + b);
    }
  }
}