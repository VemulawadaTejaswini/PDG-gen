import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int keta = 1;
    long aaa = 26;
    while(n > aaa){
      n -= aaa;
      aaa *= 26;
      keta++;
    }
    n--;
    List<Integer> li = new ArrayList<Integer>();
    for(int i = 0;i<keta;i++){
      int nn = (int)n % 26;
      li.add(nn);
      n /= 26;
      if(nn == 0 && n == 1){
        break;
      }
    }
    int size = li.size();
    for(int i = size-1;i>=0;i--){
      if(li.get(i) == 0){
        System.out.print("a");
      }else if (li.get(i) == 1){
        System.out.print("b");
      }else if (li.get(i) == 2){
        System.out.print("c");
      }else if (li.get(i) == 3){
        System.out.print("d");
      }else if (li.get(i) == 4){
        System.out.print("e");
      }else if (li.get(i) == 5){
        System.out.print("f");
      }else if (li.get(i) == 6){
        System.out.print("g");
      }else if (li.get(i) == 7){
        System.out.print("h");
      }else if (li.get(i) == 8){
        System.out.print("i");
      }else if (li.get(i) == 9){
        System.out.print("j");
      }else if (li.get(i) == 10){
        System.out.print("k");
      }else if (li.get(i) == 11){
        System.out.print("l");
      }else if (li.get(i) == 12){
        System.out.print("m");
      }else if (li.get(i) == 13){
        System.out.print("n");
      }else if (li.get(i) == 14){
        System.out.print("o");
      }else if (li.get(i) == 15){
        System.out.print("p");
      }else if (li.get(i) == 16){
        System.out.print("q");
      }else if (li.get(i) == 17){
        System.out.print("r");
      }else if (li.get(i) == 18){
        System.out.print("s");
      }else if (li.get(i) == 19){
        System.out.print("t");
      }else if (li.get(i) == 20){
        System.out.print("u");
      }else if (li.get(i) == 21){
        System.out.print("v");
      }else if (li.get(i) == 22){
        System.out.print("w");
      }else if (li.get(i) == 23){
        System.out.print("x");
      }else if (li.get(i) == 24){
        System.out.print("y");
      }else if (li.get(i) == 25){
        System.out.print("z");
      }
    }
    System.out.println("");
  }
}
