import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
  	int K = sc.nextInt();
  	String num = "";
  	while(N>0){
		num = num + N%K;
      	N = (int) N/K;
      	//System.out.println("N:" + N);
      	//System.out.println("num:" + num);
    }

	System.out.println(num.length());
}
}