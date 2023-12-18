import java.util.Scanner;

public class Main{
  public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long  ryuka[] = new long[95];
        ryuka[0] = 2;
        ryuka[1] = 1;
        for(int i = 2;i <= 90 ;i++){
          ryuka[i] = ryuka[i-1] + ryuka[i-2];
        }
        System.out.println(ryuka[n]);
  }
}
