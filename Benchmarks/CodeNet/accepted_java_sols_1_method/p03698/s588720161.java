import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	String s = scan.next();

	/* 英小文字配列 */
	int[] e = new int[26];

	int flag = 1;
	for(int i = 0; i < s.length(); i++){
	    e[s.charAt(i)-97]++;
	    if(e[s.charAt(i)-97] == 2){
		flag = -1;
		break;
	    }
	}

	if(flag == 1){
	    System.out.println("yes");
	}else{
	    System.out.println("no");
	}
    }
}
