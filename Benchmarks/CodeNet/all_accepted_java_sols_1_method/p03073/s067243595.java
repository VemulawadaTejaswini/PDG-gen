import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    long start = System.currentTimeMillis();
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count1 = 0;
    int count2 = 0;
    for(int i = 0;i < S.length();i++){
      if(i % 2 == 0){
        if(S.charAt(i) == '0'){
          count1++;
        }else{
          count2++;
        }
      }else{
        if(S.charAt(i) == '1'){
          count1++;
        }else{
          count2++;
        }
      }
    }
    System.out.println(Math.min(count1,count2));
  }
}