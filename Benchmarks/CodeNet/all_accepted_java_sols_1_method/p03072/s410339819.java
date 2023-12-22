import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt();
        int [] arr = new int [N+1];
        for (int i = 0; i < N; i++){
            arr[i] = scanner.nextInt();
        }
        int counter = 1;
        int lastseeocean = arr[0];
        for (int i = 1; i < N; i++){
            if (arr[i] >= lastseeocean){
                counter++;
                lastseeocean = arr[i];
            }
        }
        System.out.println(counter); 
}
}