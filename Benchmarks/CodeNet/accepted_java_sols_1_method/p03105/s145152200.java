import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	boolean flg = true;
		int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	if(B/A > C){
        	System.out.println(C);
        }else{
        	System.out.println(B/A);
        }
    }
}