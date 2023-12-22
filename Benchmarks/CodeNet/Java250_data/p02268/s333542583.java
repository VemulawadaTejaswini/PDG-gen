import java.util.Scanner;

class Main{

  static boolean binarySearch(int[] a, int x){
    int left = 0;
    int right = a.length;

    while(left < right){
      int k = (left + right) / 2;
      int w = a[k];
      if(w == x)
        return true;
      else if(x > w)
        left = k + 1;
      else
        right = k;
    }

    return false;
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
      if(binarySearch(a, x))
        count++;
    }


    System.out.println(count);
  }
}