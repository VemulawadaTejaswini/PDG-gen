import java.util.Scanner;
class Main{
  public static void main(String[] ar){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    
    int p=(int)B/A;
    int ans;
    
    if(p>=C){
      ans=C;
    }else{
      ans=p;
    }
    System.out.println(ans);
  }
}