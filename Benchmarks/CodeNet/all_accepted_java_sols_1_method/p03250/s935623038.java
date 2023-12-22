import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] in = new int[3];
    for(int i=0;i<3;i++){
      in[i] = scan.nextInt();
    }
    scan.close();
    
    Arrays.sort(in);
    System.out.println(in[2]*10+in[0]+in[1]);
    return;
  }
}