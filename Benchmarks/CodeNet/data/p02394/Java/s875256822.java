import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0;i<5;i++)  a[i] = sc.nextInt();
    int W = a[0];
    int H = a[1];
    int x = a[2];
    int y = a[3];
    int r = a[4];

    if((x-r)>0 && (y-r)>0 && (y+r)<H && (x+r)<W){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

