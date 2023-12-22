import java.util.Scanner;
//import java.util.Arrays;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a+1];
    b[a] = 0;
    int tmp = 0;
    int max = 0;
    for(int i = 0;i < a;i++){
      b[i] = sc.nextInt();
    }
//    System.out.println(Arrays.toString(b));
    for(int j = 0;j < a;j++){
      if(b[j] >= b[j+1] && b[j+1] != 0){
        tmp++; 
      }else{
        max = Math.max(max,tmp);
        tmp = 0;
      }
    }
    System.out.println(max);
  }
}