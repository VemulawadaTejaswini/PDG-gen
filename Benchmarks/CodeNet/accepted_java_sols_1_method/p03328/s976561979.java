import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int result = 0;
   List<Integer> list = new ArrayList<Integer>();
   for(int i = 1; i <= 999; i++){
    if(i ==1){
      list.add(1);
    } else{
      list.add((1 + i)  * i / 2);
    }
   }
   for(int i = 0; i < 999; i++){
     if(list.get(i) - a == list.get(i+1) - b){
      result = list.get(i) - a;
      break;
     }
   }
   System.out.println(result);
  }
}