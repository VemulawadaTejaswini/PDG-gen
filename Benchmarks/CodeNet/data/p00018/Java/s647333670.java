public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] a;
    int i, j, tmp;

    a = new int[5];
    for(i = 0;i < 5;i++)a[i] = sc.nextInt();
    for(i = 0;i < 5;i++){
      for(j = 0;j < 4 - i;j++){
        if(a[j] < a[j + 1]){
          tmp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = tmp;
        }
      }
    }

    for(i = 0;i < 4;i++)System.out.print(a[i] + " ");
    System.out.println(a[i]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}