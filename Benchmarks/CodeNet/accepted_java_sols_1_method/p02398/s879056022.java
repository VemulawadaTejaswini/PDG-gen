import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b,c,num=0;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    while(a<=b){
      if(c%a==0) num++;
      a++;
    }
    System.out.println(num);
  }
}

