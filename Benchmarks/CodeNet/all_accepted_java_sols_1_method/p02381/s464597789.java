import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      if(n == 0){
        break;
      }
 
      int s[] = new int[n];
      int goukei = 0;
      for(int i = 0; i < n; i++){
        s[i] = sc.nextInt();
        goukei += s[i];
      }
 
      double heikin = (double)goukei/n;
      double hensa, hensa2, a2;
      a2 = (double)0;
      for(int i = 0; i < n; i++){
        hensa = s[i] - heikin;
        hensa2 = Math.pow(hensa,2);
        a2 += hensa2/n;
      }
      double a = Math.sqrt(a2);
      System.out.println(String.format("%4f",a));
    }
  }
}
