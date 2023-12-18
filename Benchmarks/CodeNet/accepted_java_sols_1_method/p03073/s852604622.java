import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ans;
    char[] nums = sc.nextLine().toCharArray();
    int numLength = nums.length;
    int bw = 0;
    int wb = 0;
    for(int cnt = 0; cnt < numLength ; cnt++){
      if( nums[cnt] == ((cnt % 2 == 0)? '0': '1' )){
        bw++;
      }
      else {
        wb++; 
      }
    }
    ans = Math.min(bw,wb);
    System.out.println(ans);
    sc.close();
  }
}