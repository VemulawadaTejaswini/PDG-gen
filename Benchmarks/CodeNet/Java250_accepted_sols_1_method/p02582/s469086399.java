import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // 天気
        String s = sc.next();
		//連続最大日数
        int max=0;
      	//現在何連続目か
      	int now=0;
      
      	for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='R'){
            now+=1;
          }else{
            now=0;
          }
          if(now>=max){
            max=now;
          }
        }
      System.out.println(max);
    }
}