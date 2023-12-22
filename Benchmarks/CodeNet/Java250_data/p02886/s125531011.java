import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int tako[] = new int[N];
    for(int i=0; i<N; i++){
        tako[i] = sc.nextInt();
    }


    int sumTako = 0;
    for(int i=0; i<N; i++){
        for (int j=i+1; j<N; j++)
            sumTako += (tako[i]*tako[j]);
    }

    System.out.println(sumTako);

    }
}