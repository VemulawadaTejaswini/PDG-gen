import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int count1=0;
    int count2=0;

    while(x>=500){
      x-=500;
      count1++;
    }

    while(x>=5){
      x-=5;
      count2++;
    }

    System.out.println(count1*1000+count2*5);

  }
}
