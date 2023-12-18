import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double n=sc.nextDouble();
    double k=sc.nextDouble();
    double total=0;
    for(int i=1;i<=n;i++){
      int an=0;
      for(int s=0;;s++){
        if(i*Math.pow(2,s)>=k){
          an=s;
          break;
        }
      }
      total+=1/(Math.pow(2,an)*n);
    }

    System.out.println(total);

    sc.close();
  }
}