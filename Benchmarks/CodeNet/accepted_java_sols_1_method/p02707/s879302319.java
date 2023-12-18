import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    ArrayList <Integer> li = new ArrayList <Integer>();
    ArrayList <Integer> lili = new ArrayList <Integer>();
    for(int i=0; i<number-1; i++){
      int a = sc.nextInt();
      li.add(a);
    }
    for(int i=0;i<number-1;i++){
      lili.add(0);
    }
    for(int i=0; i<number-1; i++){
      int a = li.get(i);
      lili.set(a-1,lili.get(a-1)+1);
    }
    for(int i=0; i<number-1; i++){
      System.out.println(lili.get(i));
    }
    System.out.println(0);
  }
}