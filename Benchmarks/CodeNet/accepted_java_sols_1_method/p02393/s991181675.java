import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    int i,j,z;
    for(i=0;i<3;i++){
      a[i] = sc.nextInt();
    }
    for(i=0;i<3;i++){
      for(j=i+1;j<3;j++){
        if(a[i]>a[j]){
          z = a[i];
          a[i] = a[j];
          a[j] = z;
        }
      }
    }
    System.out.println(a[0] + " " + a[1] + " " + a[2]);
  }
}

