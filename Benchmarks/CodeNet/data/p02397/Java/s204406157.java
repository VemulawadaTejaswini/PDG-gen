import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int count2=1;
    for(int count=1; count==count2; count++){
      int x=sc.nextInt(), y=sc.nextInt();
      int max=x, min=x;
      if((x==0)&&(y==0)){
        break;
      }
      else{
        if(y<min){
          min=y;
        }
        else{
          max=y;
        }
      }
      System.out.println(min+" "+max);
      count2++;
    }
  }
}
