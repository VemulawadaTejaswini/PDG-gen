import java.util.Scanner;
import java.util.ArrayList;
class Main {
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  ArrayList<Integer> x = new ArrayList<Integer>();
  ArrayList<Integer> y = new ArrayList<Integer>();
  while(true){
   for(int i = 0; true; i++){
    x.add(s.nextInt());
    y.add(s.nextInt());
    if(x.get(i) == 0 || y.get(i) == 0) break;
   }
   break;
  }
  for(int i = 0; i < x.size() - 1; i++){
   if(x.get(i) > y.get(i)){
    System.out.println(y.get(i) + " " + x.get(i));
   }else{
    System.out.println(x.get(i) + " " + y.get(i));
   }
  }
 }
}