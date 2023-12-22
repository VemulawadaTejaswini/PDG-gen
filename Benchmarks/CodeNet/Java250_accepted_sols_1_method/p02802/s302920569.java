import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = 0, pen = 0;
    int[] r = new int[n + 1];
    for(int i = 0; i < m; i++){
      int p = sc.nextInt();
      if(sc.next().equals("WA")){
        if(r[p] >= 0)r[p]++;
      }else{
        if(r[p] >= 0){
          pen += r[p];
          c++;
          r[p] = -1;
        }
      }
    }
    System.out.println(c+" "+pen);
  }
}