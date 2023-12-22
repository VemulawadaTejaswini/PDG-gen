import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int count=4;
    while(s!=4&&s!=2&&s!=1){
      count++;
      s=calc(s);
    }
    System.out.println(count);
  }
  static int calc(int n){
    if(n%2==0){
      return n/2;
    }
    return 3*n+1;
  }
}