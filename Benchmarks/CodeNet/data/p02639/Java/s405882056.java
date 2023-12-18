import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList <Integer> li = new ArrayList <Integer>();
    for(int i=0;i<5;i++){
      int a = sc.nextInt();
      li.add(a);
    }
    for(int i=0;i<5;i++){
      if(li.get(i)==0){
        System.out.println(i+1);
      }
    }
  }
}