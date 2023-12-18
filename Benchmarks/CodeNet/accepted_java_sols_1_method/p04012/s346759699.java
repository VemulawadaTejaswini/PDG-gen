import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        char a[] = sc.next().toCharArray();
        int end[] = new int[28];
        for(int i = 0; i< 28;i++){
          end[i] = 0;
        }
        for(int i = 0; i < a.length;i++){
          end[a[i] - 97] = end[a[i] - 97] + 1;
        }
        for(int i = 0; i< 28;i++){
          if(end[i] % 2 == 1){
            System.out.println("No");
            System.exit(0);
          }
        }
        System.out.println("Yes");
    }
}