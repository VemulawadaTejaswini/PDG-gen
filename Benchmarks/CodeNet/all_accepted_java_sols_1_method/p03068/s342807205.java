import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	int n = sc.nextInt();
		String s = sc.next();
        int k = sc.nextInt();
        String a[] = s.split("");
        int i;
        String ans = a[k - 1];
      	for(i = 0;i < n;i++){
          if(!a[i].equals(ans)){
            a[i] = "*";
          }
        }
        
      	for(i = 0;i < s.length();i++){
          System.out.print(a[i]);
        }
      
    }
}