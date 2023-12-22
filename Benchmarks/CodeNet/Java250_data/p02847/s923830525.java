import java.util.Scanner;

class Main{
  public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    String[] week={"SUN","MON","TUE","WED","THU","FRI","SAT"};
    String in=scan.next();
    int day=0, Ans=0;
    for(int a=0; a<7; a++){
      if(in.equals(week[a])){
        day=a;
      }
    }
    Ans=7-day;
    System.out.println(Ans);
  }
}