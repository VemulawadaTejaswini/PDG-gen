import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int cou = 0;

    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }


    for(int i=0;i<n;i++){
      while(a[i]%2==0){
        cou += 1;
        a[i] = a[i]/2;
      }
    }


    System.out.println(cou);

  }
}
