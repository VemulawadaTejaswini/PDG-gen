import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    long cnt = 0;

    HashMap<String, Integer> a = new HashMap<>(n);

    for(int i=0 ; i<n ; i++){
      String str = sc.next();
      char[] aa = str.toCharArray();
      Arrays.sort(aa);
      String newStr = new String(aa);
      if(a.containsKey(newStr)){
          cnt+=a.get(newStr);
          a.put(newStr, a.get(newStr)+1);
      }else{
          a.put(newStr, 1);
      }
    }
    System.out.println(cnt);
  }
}