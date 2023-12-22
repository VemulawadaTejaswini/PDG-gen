import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int H=scan.nextInt();
    int W=scan.nextInt();
    int N=scan.nextInt();
    int[] a=new int[N];
    for(int i=0;i<N;i++){
      a[i]=scan.nextInt();
    }
    int[][] b=new int[H][W];
    int k=0,l=0;
    int line=1;
    for(int i=0;i<N;i++){
      for(int j=0;j<a[i];j++){
        if(line%2!=0){
          b[k][l]=i+1;
          k++;
        }else{
          k--;
          b[k][l]=i+1;
        }
        
        if(k==0||k==H){
          l++;
          line++;
        }
      }
    }
    for(int i=0;i<H;i++){
      for(int j=0;j<W;j++){
        System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
  }
}