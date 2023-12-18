import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long[] L = new long[];
    for(int i=0;i<N;i++){
      L[i] = scan.nextLong();
    }
    int ans=0;
    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        if(i==j)break;
        for(int k=0;k<N;k++){
          if(j==k||k==i)break;
          if(L[i]>L[j]+L[k])ans++;
        }
      }
    }
    System.out.println(ans/2);