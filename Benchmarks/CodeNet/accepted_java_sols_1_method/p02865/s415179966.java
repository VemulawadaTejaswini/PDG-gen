import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int kotae = 0;
      	if(a%2==0){
        	kotae = (a/2)-1;
        }else{
        	kotae = (a/2);
        }
      System.out.println(kotae);
	}
}