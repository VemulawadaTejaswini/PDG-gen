import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[4];
    for(int i=0;i<3;i++)  a[i] = sc.nextInt();
    for(int i=0;i<3-1;i++){
      for(int j=0;j<3-i;j++){
        if(a[j]>a[j+1]){
          a[3] = a[j];
          a[j] = a[j+1];
          a[j+1] = a[3] ;
        }
      }
    }
    System.out.print(a[0]+" "+a[1]+" "+a[2]);
  }
}

