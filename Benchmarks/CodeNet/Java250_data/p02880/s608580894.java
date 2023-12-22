import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
      
        for(int i = 1;i <= 9;i++){
       	    for(int j = 1; j <= 9;j++){
              if(i * j == a){
                System.out.println("Yes");
                System.exit(0);
              }
            }
        }
        System.out.println("No");
    }
}