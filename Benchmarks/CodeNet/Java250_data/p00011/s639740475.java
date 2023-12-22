import java.io.*;
import java.util.Scanner;
public class Main{ 
  public static void main(String[]args){ 
    Scanner sc = new Scanner(System.in);
int w = sc.nextInt(); 
int n= sc.nextInt();
    int [] a = new int[30];
    int [] b = new int[30];
    int [] S = new int[30];
    int i=0,j=0,k=0,p,q;
    while(j<w){
      S[j]=j + 1;
      j++;
    }
    while(i<n){
      String str = sc.next();       
      String[] ab = str.split(","); 
      a[i] = Integer.parseInt(ab[0]);
      b[i] = Integer.parseInt(ab[1]);
      p=S[a[i]-1];
      S[a[i]-1]=S[b[i]-1];
      S[b[i]-1]=p;
      i++;
    }
    while(k<w){
      System.out.printf("%d\n",S[k]);
      k++;
    }
  }
}