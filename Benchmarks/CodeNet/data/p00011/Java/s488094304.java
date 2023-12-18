// 演習４−２
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useDelimiter("[,\\s]+");
    int w=scan.nextInt();
    int n=scan.nextInt();
    int[] F;
    int i;

    F= new int[w+1];
    for(i=1;i<w+1;i++){
    F[i]=i;
    }
    for(i=0;i<n;i++){
     int a=scan.nextInt();
     int b=scan.nextInt();
     int temp = F[a];
     F[a]=F[b];
     F[b]= temp;
    }
    for (i=1;i<w+1;i++) {
            System.out.println(F[i]);
        }


    }
  }

