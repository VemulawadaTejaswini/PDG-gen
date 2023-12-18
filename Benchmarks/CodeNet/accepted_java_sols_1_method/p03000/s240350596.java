import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int l;
    int d = 0;
    int t = 1;
    for(int a = 0; a < n; a++){
      l = sc.nextInt();
      d = d + l;
      if(d <= x){
        t++;
      }        
    }
    System.out.println(t);
  }
}