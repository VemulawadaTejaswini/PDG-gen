import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      String S=sc.next();
      int n=S.length();
      int array[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++){
        array[i]=S.charAt(i)-'0';
      }
      if(n==1&&array[0]==0) break;
      for(int i=0;i<n;i++) sum+=array[i];
      System.out.println(sum);
    }
      sc.close();
  }
}
