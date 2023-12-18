import java.util.*;
public class Main{
public static void main(String[] args){
String[] days={"MON","TUE","WED","THU","FRI","SAT","SUN"};
Scanner s=new Scanner(System.in);
  String in=s.next();
  int mark;
 	for(int i=0;i<days.length;i++){
    if(in.equals(days[i])){
      int ans=6-i;
      if(ans==0)
        ans=7;
    System.out.println(ans);
      break;}
    }
}
}