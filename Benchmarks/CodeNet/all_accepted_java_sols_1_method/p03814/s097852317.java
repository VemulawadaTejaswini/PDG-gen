import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  String s = sc.next();
  char[] c = s.toCharArray();
  int first;
  int last;
  for(int i = 0;;i++){
    if(c[i] == 'A'){
      first = i;
      break;
    }
  }
  for(int i = s.length()-1;;i--){
    if(c[i] == 'Z'){
      last = i;
      break;
    }
  }
  System.out.println(last - first + 1);
}}
