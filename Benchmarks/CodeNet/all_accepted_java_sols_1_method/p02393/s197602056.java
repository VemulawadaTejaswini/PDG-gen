import java.util.Scanner;
public class Main{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = {0,0,0};
    int i,t,j;
    for ( i = 0; i < 3; i++) {
       a[i] = sc.nextInt();
    }

    for ( i = 0; i < 3; i++) {
       for ( j = i+1; j < 3; j++) {
          if(a[i]>a[j]){
             t = a[i];
             a[i] = a[j];
             a[j] = t;
          }
       }
    }

    System.out.println(a[0]+" "+a[1]+" "+a[2]);

    

  }
}

