import java.util.*;
public class Main{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

while(true){
  String b = sc.next();
  int a = b.length();
  int goukei = 0;
  int kazu[] = new int [a];

  if(b.equals("0"))
    break;
  for(int i = 0; i<a; i++){
    kazu[i] = b.charAt(i)-'0';
    goukei += kazu[i];
  }
  System.out.println(goukei);
}

}
}

