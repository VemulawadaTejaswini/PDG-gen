public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] c;
    int y, i;

    c = new int[51];
    for(i = 0;i < 51;i++)c[i] = 850 * 200;
    c[0] = 0;
    for(i = 0;i < 51;i++){
      if(i + 2 < 51 && c[i] + 380 < c[i + 2])c[i + 2] = c[i] + 380;
      if(i + 3 < 51 && c[i] + 550 < c[i + 3])c[i + 3] = c[i] + 550;
      if(i + 5 < 51 && c[i] + 850 < c[i + 5])c[i + 5] = c[i] + 850;
      if(i + 10 < 51 && c[i] + 1900 * 8 / 10 < c[i + 10])
        c[i + 10] = c[i] + 1900 * 8 / 10;
      if(i + 12 < 51 && c[i] + 2200 * 85 / 100 < c[i + 12])
        c[i + 12] = c[i] + 2200 * 85 / 100;
      if(i + 15 < 51 && c[i] + 2550 * 88 / 100 < c[i + 15])
        c[i + 15] = c[i] + 2550 * 88 / 100;
    }

    for(;;){
      y = sc.nextInt(); if(y == 0)break;
      out.println(c[y / 100]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}