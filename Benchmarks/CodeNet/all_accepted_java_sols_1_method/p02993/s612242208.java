import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int N1=N%10;
      	int N2=(N%100-N1)/10;
      	int N3=(N%1000-N1-N2)/100;
      	int N4=(N-N1-N2-N3)/1000;
      if(N1==N2||N2==N3||N3==N4){
        System.out.println("Bad");
      }else{
      System.out.println("Good");
      }
	}
}