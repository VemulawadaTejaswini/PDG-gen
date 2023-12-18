public class at173_a {
  public static void main(String args[]){
    int n = 10;
    int x = (n+1000-1)/1000;
    int ans = x*1000 - n;
    System.out.println(ans);
  }
}