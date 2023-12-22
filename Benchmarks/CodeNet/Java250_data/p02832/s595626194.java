import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i=0;i<n;i++)a[i] = Integer.parseInt(sc.next());
    
    int val = 1;
    for(int i=0;i<n;i++){
      if(a[i]==val)val++;
    }
    if(val>1){
      System.out.println(a.length-(val-1));
    }else{
      System.out.println(-1);
    }
  }
}