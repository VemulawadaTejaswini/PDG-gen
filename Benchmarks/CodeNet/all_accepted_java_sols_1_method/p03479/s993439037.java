import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
  long x = sc.nextLong();
  long y = sc.nextLong();
  int counter = 0;
  while(x<=y){
    x *= 2;
    counter++;
  }
  System.out.println(counter);
}}
