import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
	Scanner scanner = new Scanner(System.in);
	int summer = scanner.nextInt();
	//宿題の数
	int num = scanner.nextInt();
	//計算用
      int tmp = 0;
      
	for(int i=0;i<num;i++){
        tmp += scanner.nextInt();
	}
	
    int day = summer - tmp;
      
    if(day>=0){
      System.out.println(day);
    }else{
       System.out.println(-1);
    }
      
    }
}