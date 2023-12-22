import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[3];
    for(int i = 0; i < 3; i++){
      array[i] = -1;
    }
    int m = sc.nextInt();
    for(int i = 0; i < m; i++){
      int s = sc.nextInt();
      int c = sc.nextInt();
      if(n!=1&&s==1&&c==0){
        System.out.println(-1);
        return;
      }
      if(array[s-1]!=-1&&array[s-1]!= c){
        System.out.println(-1);
        return;
      }
      array[s-1] = c;
    }
    for(int i = 0; i < 3; i++){
      if(n!=1&&i==0&&array[i]==-1){
        array[i] = 1;
      }
      if(array[i]==-1){
        array[i]=0;
      }
    }
    int num = 0;
    for(int i = 0; i < n; i++){
      num = num*10;
      num+=array[i];
    }
    System.out.println(num);
  }
}