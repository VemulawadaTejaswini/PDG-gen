import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int n=b-a;
    int total=0;
    for(int i=0;i<n;i++){
      total+=n-i;
    }
    System.out.println(total-b);

    sc.close();

  }
}