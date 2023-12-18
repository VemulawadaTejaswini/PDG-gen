import java.util.*;

class Main{
  static Set<Character> list;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    list = new HashSet<>();
    list.add('a');
    list.add('i');
    list.add('u');
    list.add('e');
    list.add('o');
    int n;
    loop:while(scan.hasNext()) {
      n = scan.nextInt();
      if(n==0) return;
      String[] arr = new String[n];
      for(int i = 0; i < n; i++) arr[i] = getShortName(scan.next().toCharArray());
      Arrays.sort(arr);
      int result = 0;
      for(int i = 0; i < n-1; i++) {
        if(arr[i].equals(arr[i+1])) {
          System.out.println(-1);
          continue loop;
        }else {
          int same = 0;
          for(int j = 0; j < Math.min(arr[i].length(),arr[i+1].length()); j++) {
            if(arr[i].charAt(j)==arr[i+1].charAt(j)) {
              same++;
            }
          }
          result = Math.max(same,result);
        }
      }
      System.out.println(result+1);
    }
  }

  public static String getShortName(char[] input) {
    String result = ""+input[0];
    for(int i = 1; i < input.length; i++) {
      if(list.contains(input[i-1])) {
        result += input[i];
      }
    }
    return result;
  }
}