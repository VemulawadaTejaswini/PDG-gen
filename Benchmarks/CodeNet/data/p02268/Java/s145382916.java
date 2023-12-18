import java.util.Scanner;

class Main{

  static boolean binarySearch(int[] a, int x, int left, int right){
    if(left >= right)
      return false;
    else{
      int k = (left+right)/2;
      int w = a[k];
      if(w == x)
        return true;
      else if(x > w)
        return binarySearch(a, x, k, right);
      else
        return binarySearch(a, x, left, k);
    }
  }

  public static void main(String[] arsg){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];

    for(int i = 0; i < n; i++)
      a[i] = stdIn.nextInt();

    int q = stdIn.nextInt();
    int count = 0;
    for(int i = 0; i < q; i++){
      int x = stdIn.nextInt();
      if(binarySearch(a, x, 0, n-1))
        count++;
    }


    System.out.println(count);
  }
}