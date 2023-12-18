import java.util.*;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    String s_x = scanner.nextLine();
    char[] c_x = s_x.toCharArray();

    for(int i=0; i<n; i++){
      char[] tmp = new char[n];
      System.arraycopy(c_x, 0, tmp, 0, n);
      tmp[i] = (char)((Integer.parseInt(String.valueOf(tmp[i])) + 1) % 2 + '0');
      String x = new String(tmp);
      int ans = f(x,0);
      System.out.println(ans);

    }
    
   
    
    scanner.close();
    return;
  }

  public static int f(String x, int ans){
    int dec = Integer.parseInt(x, 2);
    // System.out.println(x +"," + dec+","+ans);
    if(dec != 0){
      int pop = 0;
      for(char c_x : x.toCharArray() ){
        if(c_x == '1'){
          pop++;
        }       
      }
      dec = dec % pop;
      ans += 1;
      ans = f(Integer.toBinaryString(dec), ans);
    }
    return ans;
  }
  
}