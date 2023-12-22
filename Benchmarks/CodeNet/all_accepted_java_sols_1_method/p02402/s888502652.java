import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int n, max = -1000000, min = 1000000, input;
    long sum = 0;

    Scanner in = new Scanner(System.in);
    n = in.nextInt();

    for(int i=0; i<n; i++){
        input = in.nextInt();
        if(input > max){
            max = input;
        }
        if( input < min){
            min = input;
        }
        sum += input;
    }
    
    System.out.println(min + " " + max + " " + sum);
  }
}