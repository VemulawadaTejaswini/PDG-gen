import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  Scanner in=new Scanner(System.in);

  int n, sum;

  while(true){
  int count = 0;
  n = in.nextInt();
  sum = in.nextInt();

  if(n==0 && sum==0)break;

    for(int i=1;i<n-1;i++){
      for(int j=i+1;j<n;j++){
      int r =sum - i - j;
        if(r>j && r<=n)
        count++;
        }
      }
    System.out.println(count);
  }
  }
}