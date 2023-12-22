import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int number= 0;
    String li[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    for(int i=0;i<7;i++){
      if(S.equals(li[i])){
        number = 7-i;
      }
    } 
    System.out.println(number);
  }
}       