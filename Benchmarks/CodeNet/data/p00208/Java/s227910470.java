import java.util.*;

class Main{
  public static void main(String[] args){
    ArrayList<String> num  = new ArrayList<String>();
    ArrayList<String> num2 = new ArrayList<String>();
    Scanner in = new Scanner(System.in);
    
    for (int i = 0; i < 100000000000L; i++){
      num.add(String.valueOf(i));
    }
    for (int i = 0; i < 10000000000L; i++){
      if (!(num.get(i).contains("4") || num.get(i).contains("6"))){
        num2.add(num.get(i));
      }
    }
    while (in.hasNext()){
      int ans = in.nextInt();
      if (ans == 0){
        System.out.println("0");
      }
      if (!(ans == 0)){
        System.out.println((num2.get(ans)));
      }
    }
  }
}