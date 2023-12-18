import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a[][] = new int[3][3];
        for(int i = 0;i < 3;i++){
          for(int j = 0;j < 3;j++){
            a[i][j] = sc.nextInt();
          }
        }
		int n = sc.nextInt();
        int b,count = 0;
        
        while(count < n){
          b = sc.nextInt();
          for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
              if(b == a[i][j]){
                a[i][j] = 0;
              }
            }
          }
          count += 1;
        }
      
        for(int i = 0;i < 3;i++){
          if(a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0){
            System.out.println("Yes");
            return;
          }
        }
        for(int i = 0;i < 3;i++){
          if(a[0][i] == 0 && a[1][i] == 0 && a[2][i] == 0){
            System.out.println("Yes");
            return;
          }
        }
        if(a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0){
            System.out.println("Yes");
            return;          
        }
        if(a[2][0] == 0 && a[1][1] == 0 && a[2][0] == 0){
            System.out.println("Yes");
            return;          
        }        
        
        System.out.println("No");
    }
}