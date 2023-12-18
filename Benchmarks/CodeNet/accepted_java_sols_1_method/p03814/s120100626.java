import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//文字列の入力
		String S = sc.next();
      	//Z番目-A番目+1をしたい
      	//特定の文字が何番目に出るか
      	int a = S.indexOf("A");
      	int z = S.lastIndexOf("Z");
     	 System.out.println(z-a+1);
        }
}