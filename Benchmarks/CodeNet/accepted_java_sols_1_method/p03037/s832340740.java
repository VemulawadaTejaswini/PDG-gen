import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int cardNum = Integer.parseInt(sc.next());
        int gateNum = Integer.parseInt(sc.next());
      	int lowNum = 1;
      for (int y = 1; y <= gateNum; y++) {
        int low = Integer.parseInt(sc.next());
        int high = Integer.parseInt(sc.next());
		lowNum = lowNum<low?low:lowNum;
        cardNum = high<cardNum?high:cardNum;
      }
      System.out.println(cardNum-lowNum+1>=0?cardNum-lowNum+1:0);
  }
}