import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String args[]){
  int vec[] = new int[3];
  Scanner scan = new Scanner(System.in);
  vec[0] = scan.nextInt();
  vec[1] = scan.nextInt();
  vec[2] = scan.nextInt();
  scan.close();
  Arrays.sort(vec);
  int count = 0;
  count = vec[2] - vec[1];
  vec[1] = vec[2];
  vec[0] += count;
  if((vec[1] - vec[0]) % 2 == 0){
    count += (vec[1] - vec[0])/2;
    System.out.println(count);
  }
  else{
    count += (vec[1] - vec[0])/2 +2;
    System.out.println(count);
  }
  }
}
