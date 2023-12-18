//import java.io.File;
import java.util.Scanner;

class Main{
  public static void main(String[] args) throws Exception{
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();
    int[] arr = new int[input1];
    int ite = 0;
    int answer = 0;

    for(int incount = 0; incount < input1; incount++) {
      int input2 = scan.nextInt();
      boolean flag = true;
      for(int i = 0; i < ite; i++) {
        if(arr[i] > input2) {
          answer += ite-i-1;
          ite = i+1;
          arr[ite] = input2;
          ite++;
          flag = false;
          break;
        }else if(arr[i] == input2) {
          answer += ite-i-1;
          ite = i+1;
          flag = false;
          break;
        }
      }
      if(flag) {
        arr[ite] = input2;
        ite++;
      }
/*
      for(int j = 0; j < ite; j++) {
        System.out.print(arr[j]+",");
      }
      System.out.println(" answer -> "+answer);
*/
    }
    //System.out.println(answer+ite);
  }
}