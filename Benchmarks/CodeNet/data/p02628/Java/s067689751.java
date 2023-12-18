import java.util.Scanner;

class Main{
  static void swap(int[] a, int idx1, int idx2){
    int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
  }

  static void quickSort(int[] a, int left, int right){
    int pl = left;
    int pr = right;
    int x  = a[(pl+pr)/2];

    do{
      while (a[pl] < x) pl++;
      while (a[pr] > x) pr--;
      if(pl <= pr)
         swap(a, pl++, pr--);
    }while(pl <= pr);

   if(left < pr) quickSort(a,left,pr);
   if(pl < right) quickSort(a,pl,right);
 }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];
    for(int i =0; i<N;i++){
      p[i] = sc.nextInt();
    }
    
    quickSort(p,0,N-1);
    
    int sum = 0;
    for(int i = 0; i<K; i++){
      sum += p[i];
    }
    System.out.println(sum);
  }
}