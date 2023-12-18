import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int n;

    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    in.nextLine();

    int [] input = new int[n];

    for(int i=0; i<n; i++){
        input[i] = in.nextInt();
    }
    for(int i=n-1; i>0; i--){
        System.out.print(input[i] + " ");
    }
    System.out.println(input[0]);
  }
}