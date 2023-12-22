import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  Set<String> s = new HashSet<String>();
  int counter = 0;
  for(int i = 0;i < N;i++){
    int a = sc.nextInt();
    if(a < 400)s.add("a");
    else if(a < 800)s.add("b");
    else if(a < 1200)s.add("c");
    else if(a < 1600)s.add("d");
    else if(a < 2000)s.add("e");
    else if(a < 2400)s.add("f");
    else if(a < 2800)s.add("g");
    else if(a < 3200)s.add("h");
    else if(a >= 3200)counter++;
  }
  if(s.size() == 0){
    System.out.println("1");
  }
  else{
    System.out.print(s.size() > 8 ? "8" : s.size());
  }
  System.out.print(" ");
  System.out.println(s.size() + counter);
}}
