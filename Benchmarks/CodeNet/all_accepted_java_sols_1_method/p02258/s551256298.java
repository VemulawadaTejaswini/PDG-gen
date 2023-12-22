import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] r = new int[n];
    for(int i = 0; i < n; i++)
      r[i] = stdIn.nextInt();

    int maxv = r[1] - r[0];
    int minv = r[0];
    for(int j = 1; j < n; j++){
      int diff = r[j] - minv;
      if(diff > maxv)
        maxv = diff;
      if(minv > r[j])
        minv = r[j];
    }

    System.out.println(maxv);
  }
}