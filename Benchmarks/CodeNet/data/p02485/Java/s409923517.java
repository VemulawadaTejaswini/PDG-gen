import java.util.Scanner;
public class Main{ 
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int k=0;
    int t = x;
    while(t>0){
      t /= 10;
      k++;
    }
    int S3 = 0;
    int [] S;
    int [] S2;
    S = new int [100];
    S2 = new int [100];
    int i = k-1;
    S2[k]=x;
    while(i>=0){
      while(true){
        S[i]=S2[i+1]/(int)Math.pow(10,i);
        if(S[i]==0){
          S2[i]=S2[i+1];
          i--;
          System.out.println("a");
          break;
        }
        else if(S[i]!=0){
          S2[i]=S2[i+1]-S[i]*(int)Math.pow(10,i);
          S3 = S3 + S[i];
          System.out.println("b");
          i--;
          break;
        }
      }
    }
    System.out.printf("%d\n",S3);
  }
}