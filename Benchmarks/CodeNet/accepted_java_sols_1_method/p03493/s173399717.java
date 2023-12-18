import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    //
	    String a = sc.next();
	    int count = 0;
	    // スペース区切りの整数の入力
	    char c = '1';
	   for(char b : a.toCharArray()){
          if(b==c){
        	  count++;
          }
	   }
	    // 文字列の入力

	    // 出力
	    System.out.println(count);
	  }
	}

