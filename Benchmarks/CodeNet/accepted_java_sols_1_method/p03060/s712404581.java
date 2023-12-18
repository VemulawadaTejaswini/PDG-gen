import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();

    int c[] = new int[50];
    int v[] = new int[50];
    int ans=0;

    for(int i=0;i<n;i++){
      v[i]=scanner.nextInt();
    }

    for(int i=0;i<n;i++){
      c[i]=scanner.nextInt();
    }

    for(int i=0;i<n;i++){
      if(v[i]-c[i]>0){
        ans+=v[i]-c[i];
      }
    }

    System.out.println(ans);
  }
}
