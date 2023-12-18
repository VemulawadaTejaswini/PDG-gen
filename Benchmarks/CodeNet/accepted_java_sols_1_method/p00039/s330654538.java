import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    HashMap<Character,Integer> roman = new HashMap<Character,Integer>();
    char[] charArr = {'I','V','X','L','C','D','M'};
    int[] intArr   = {1,5,10,50,100,500,1000};
    for (int i = 0; i < 7; i++) {
      roman.put(charArr[i],intArr[i]);
    }
    while(sc.hasNext()) {
      String str = sc.next();
      int sum = roman.get(str.charAt(0));
      for(int i = 1; i < str.length(); i++) {
        if(roman.get(str.charAt(i)) > roman.get(str.charAt(i-1))) {
          sum += roman.get(str.charAt(i)) - 2*roman.get(str.charAt(i-1));
        }
        else {
          sum += roman.get(str.charAt(i));
        }
      }
      System.out.println(sum);
    }
  }
}