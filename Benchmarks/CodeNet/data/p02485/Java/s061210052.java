import java.util.Scanner;
public class Main{ 
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int r=0;
    int z=0;
    int [] S3;
    S3 = new int [10000];
    while(true){
      int x = sc.nextInt();
      if(x==0) break;
      int k=0;
      int t = x;
      while(t>0){
        t /= 10;
        k++;
      }
      int [] S;
      int [] S2;
      S = new int [10000];
      S2 = new int [10000];
      int i = k-1;
      S2[k]=x;
      while(i>=0){
        while(true){
          S[i]=S2[i+1]/(int)Math.pow(10,i);
          if(S[i]==0){
            S2[i]=S2[i+1];
            i--;
            break;
          }
          else if(S[i]!=0){
            S2[i]=S2[i+1]-S[i]*(int)Math.pow(10,i);
            S3[r] = S3[r] + S[i];
            i--;
            break;
          }
        }
      }
      r++;
    }
    while(z<r){
      System.out.printf("%d ",S3[z]);
      z++;
    }
    System.out.println("");
  }
}