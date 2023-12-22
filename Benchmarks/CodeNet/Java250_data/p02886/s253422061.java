import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int total = 0;
    int[] d = new int[t];
    for(int i = 0;i<t;i++){
      d[i] = sc.nextInt();
    }
    for(int i = 0;i<t;i++){
      for(int j = i+1;j<t;j++){
        total = total + d[i]*d[j];
      }
    }
    System.out.println(total);
  }
}
