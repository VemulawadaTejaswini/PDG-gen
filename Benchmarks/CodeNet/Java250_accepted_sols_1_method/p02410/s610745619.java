import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int rows,cols;
    int [][] a,b,c;

    Scanner in = new Scanner(System.in);

    rows = in.nextInt();
    cols = in.nextInt();

    a = new int[rows][cols];
    b = new int[cols][1];
    c = new int[rows][1];
    in.nextLine();

    for(int i=0; i<a.length; i++){
        for(int j=0; j<a[0].length; j++){
            a[i][j] = in.nextInt();
        }
        in.nextLine();
    }

    for(int i=0; i<b.length; i++){
        b[i][0] = in.nextInt();
        in.nextLine();
    }

    for(int i=0; i<a.length; i++){
        int tmp = 0;
        for(int j=0; j<a[0].length; j++)
            tmp += a[i][j]*b[j][0];
        c[i][0] = tmp;
    }

    for(int i=0; i<c.length; i++){
        System.out.println(c[i][0]);
    }
  }
}