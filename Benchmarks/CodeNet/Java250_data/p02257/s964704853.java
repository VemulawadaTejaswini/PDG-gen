public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a;
    int i, j;
    int p, no;

    n = sc.nextInt();
    a = new int[n];
    for(i = 0;i < n;++i){
      a[i] = sc.nextInt();
      if(a[i] % 2 == 0 && a[i] != 2)a[i] = 0;
    }

    p = 0;
    no = 0;
    for(i = 0;i < n;i++){
      if(a[i] > 9){
        for(j = 3;;j+=2){
          if(a[i] % j == 0){
            no = 0;
            break;
          }
          if(j * j > a[i]){
            no = 1;
            break;
          }
        }
        if(no == 1){
          ++p;
        }
      }else{
        if(a[i] == 2 || a[i] == 3 || a[i] == 5 || a[i] == 7){
          ++p;
        }
      }
    }

    System.out.println(p);
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}