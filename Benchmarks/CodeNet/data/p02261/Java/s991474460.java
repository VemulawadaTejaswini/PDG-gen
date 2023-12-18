public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    String[] card;
    int i;
    int[] a, buba, sela;
    char[] c, bubc, selc;

    n = sc.nextInt();
    card = new String[n];
    a = new int[n];
    buba = new int[n];
    sela = new int[n];
    c = new char[n];
    bubc = new char[n];
    selc = new char[n];

    for(i = 0;i < n;i++){
      card[i] = sc.next();
      c[i] = card[i].charAt(1);
      a[i] = c[i] - '0';
      buba[i] = a[i];
      sela[i] = a[i];
      c[i] = card[i].charAt(0);
      bubc[i] = c[i];
      selc[i] = c[i];
    }

    bubblesort(buba, bubc, n);
    System.out.println("Stable");
    selectionsort(sela, selc, n);
    for(i = 0;i < n;i++){
      if(selc[i] != bubc[i]){
        break;
      }
    }
    if(i < n){
      System.out.println("Not stable");
    }else{
      System.out.println("Stable");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static void bubblesort(int[] buba, char[] bubc, int n){
    int i, j, tmp;
    char ctmp;

    for(i = 0;i < n - 1;i++){
      for(j = 0;j < n - 1 - i;j++){
        if(buba[j] > buba[j + 1]){
          tmp = buba[j];
          buba[j] = buba[j + 1];
          buba[j + 1] = tmp;
          ctmp = bubc[j];
          bubc[j] = bubc[j + 1];
          bubc[j + 1] = ctmp;
        }
      }
    }

    for(i = 0;i < n - 1;i++){
      System.out.print(bubc[i] + "" + buba[i] + " ");
    }
    System.out.println(bubc[n - 1] + "" + buba[n - 1]);

    return;
  }

  private static void selectionsort(int[] sela, char[] selc, int n){
    int i, j, tmp, min;
    char ctmp;

    for(i = 0;i < n - 1;i++){
      min = i;
      for(j = i + 1;j < n;j++){
        if(sela[min] > sela[j])min = j;
      }
      if(min != i){
        tmp = sela[min];
        sela[min] = sela[i];
        sela[i] = tmp;
        ctmp = selc[min];
        selc[min] = selc[i];
        selc[i] = ctmp;
      }
    }

    for(i = 0;i < n - 1;i++){
      System.out.print(selc[i] + "" + sela[i] + " ");
    }
    System.out.println(selc[n - 1] + "" + sela[n - 1]);

    return;
  }
}