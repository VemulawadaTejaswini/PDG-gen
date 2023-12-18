import java.util.*;

public class Main{
  public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int x=sc.nextInt();

int h,m,s;
s=x%60;
m=(x/60)%60;
h=x/3600;

System.out.println(h ":" m ":" s);
}
}



