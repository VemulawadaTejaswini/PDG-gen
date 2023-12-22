import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      	String s[] = sc.next().split("");
        int ans = n * 2;
        int count = 0;
        int e = 0,w = 0,back = 0;
      
        for(int i = 0;i < n;i++){
            if(s[i].equals("E")){
              e++;
            }else{
              w++;
            }
        }
        for(int i = 0;i < n;i++){
          count = 0;
            if(s[i].equals("E")){
              e--;
              count = e + back;
            }else{
              count = e + back;
              back++;
            }
          if(count < ans){
            ans = count;
          }
        }
      
        System.out.println(ans); 
    }
}