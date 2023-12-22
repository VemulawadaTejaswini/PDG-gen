/*
平方根が少数のときに気をつける
*/

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int target = Integer.parseInt(a + b);
    boolean flag = false;

    //デバッグ
    //System.out.println(target);
    for(double i = 1; i <= Math.sqrt(target); i++){
      if((double)target / i == i){
        flag = true;
        /*System.out.println(target / i);
        System.out.println(i);*/
        break;
      }
    }

    if(flag){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
