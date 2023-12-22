import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] list = new int[n][2];
      int correct=0;
      int penalty=0;
      for(int i=0;i<m;i++){
        int p = sc.nextInt();
        String s = sc.next();
        if(s.equals("AC") && list[p-1][0]!=1){
          list[p-1][0]=1;
          correct++;
          penalty+=list[p-1][1];
        }else if(s.equals("WA") && list[p-1][0]!=1){
          list[p-1][1]++;
        }
      }      
      System.out.println(correct+" "+penalty);
    }
}
