import java.util.Scanner;
import java.util.ArrayList;
class Main {
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  ArrayList<Integer> ary = new ArrayList<Integer>();
  int count = 0;
  while(true){
   ary.add(s.nextInt());
   if(ary.get(count) == 0) break;
   count++;
  }
  for(int i = 0; i < ary.size(); i++){
   if(ary.get(i) != 0) System.out.println("Case" + (i + 1) + ": " + ary.get(i));
  }
 }
}