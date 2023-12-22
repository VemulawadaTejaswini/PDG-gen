import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N=scanner.nextInt();
    int ans=0;
    int nn=N;
    while(N>=1){
      ans+=N%10;
      N/=10;
    }

    if(nn%ans==0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }

  }
}
