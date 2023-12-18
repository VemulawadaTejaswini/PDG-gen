import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int xans=0;
    int yans=0;

    if(x==1||x==3||x==5||x==7||x==8||x==10||x==12) xans=1;
    if(x==4||x==6||x==9||x==11) xans=2;
    if(x==2) xans=3;

    if(y==1||y==3||y==5||y==7||y==8||y==10||y==12) yans=1;
    if(y==4||y==6||y==9||y==11) yans=2;
    if(y==2) yans=3;

    if (xans==yans) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
