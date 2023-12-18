import java.util.*;
public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(N=3;N<=100;N++){
      Random rand=new Random();
      int a=rand.nextInt(7)+1;
      int b=rand.nextInt(7)+1;
      int c=rand.nextInt(7)+1;
      int d=rand.nextInt(7)+1;
      int e=rand.nextInt(7)+1;
      int f=rand.nextInt(7)+1;
      if((a==b)&&(c==d)&&(e==f)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}
