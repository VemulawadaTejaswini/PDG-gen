    import java.util.*;
    class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      int d=sc.nextInt();
      int t=sc.nextInt();
      int s=sc.nextInt();
      float c=d/s;
      if(c<=t){
      System.out.println("Yes");
      }else{
       System.out.println("No");
      }
    }
    }