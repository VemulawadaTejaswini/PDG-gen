import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      while(true){
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n==0&&r==0)break;
        int [] fuda = new int[n];
        for(int i=0;i<n;i++){
          fuda[i] = i + 1;
        }
        for(int i=0;i<r;i++){
          int p = sc.nextInt();
          int c = sc.nextInt();
          int [] swap = new int[p - 1];
          for(int j=0;j<p-1;j++){
            swap[j] = fuda[n - 1 - j];
          }
          for(int j=0;j<c;j++){
            fuda[n - 1 - j] = fuda[n - j - p];
          }
          for(int j=0;j<p-1;j++){
            fuda[n - 1 - j - c] = swap[j];
          }
        }
        System.out.println(fuda[n - 1]);
      }
    }
  }
}

