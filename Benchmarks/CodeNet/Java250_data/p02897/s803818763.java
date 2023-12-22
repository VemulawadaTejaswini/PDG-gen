import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    double num=n.nextInt();
    double a;
    if(num%2==1){
      a=(num+1)/2;
    }else{
      a=num/2;
    }
    System.out.println(a/num);
  }
}