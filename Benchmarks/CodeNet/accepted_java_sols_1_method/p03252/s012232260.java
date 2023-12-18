import java.util.*;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
String S = sc.next();
String T = sc.next();
boolean answer=true;
int length=S.length();
ArrayList<Character> list = new ArrayList<Character>();
for(int i=0;i<length;i++){
char s=S.charAt(i);
char t=T.charAt(i);
  if(t!=s){
    S = S.replaceAll(String.valueOf(s), "0");
    S = S.replaceAll(String.valueOf(t), String.valueOf(s));
    S = S.replaceAll("0", String.valueOf(t));
    if(list.contains(t)){
      break;
    }else{
      list.add(t);
    }

  }
}




if(S.equals(T)){
  System.out.println("Yes");
}else{
  System.out.println("No");
}
}
}
