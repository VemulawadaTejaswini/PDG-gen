import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int answer;
    while(true){
      int n = sc.nextInt();
      int x = sc.nextInt();
      if(n==0&&x==0)
      break;
      int a,b,k;
      a=x/3;
      answer = 0;
      for(int i=1;i<a;i++){
        b=(x-i)/2;
        for(int j=i+1;j<=b;j++){
          k=x-i-j;
          if(j<k&&k<=n)
          answer ++;
        }
      }
      System.out.printf("%d\n",answer);
    }
}
}
