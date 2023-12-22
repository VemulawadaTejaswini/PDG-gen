import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int[] b = new int[N-1];
    
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    
    for(int j=0;j<N-1;j++){
      if(a[j+1]<=a[j]){
        b[j] = 1;
      }else{
        b[j] = 0;
      }
    }
    
    int  b_max = 0;
    int count = 0;
    for(int c=0;c<N-1;c++){
      if(b[c]==1){
        count++;
      }else{
        if(count>b_max){
          b_max = count;
        }
        count = 0;
      }
    }
    if(count>b_max){
          b_max = count;
    }
    System.out.println(b_max);
  }
}