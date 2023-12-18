import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	String sa = scan.next();
	String sb = scan.next();
	String sc = scan.next();

	/* 前準備 */
	char turn = sa.charAt(0);
	sa = sa.substring(1,sa.length());

	while(true){
	    /* 次のターンを決める */
	    if(turn == 'a'){
		if(sa.length() == 0){
		    System.out.println("A");
		    break;
		}else{
		    turn = sa.charAt(0);
		    sa = sa.substring(1,sa.length());
		}
	    }else if(turn == 'b'){
		if(sb.length() == 0){
		    System.out.println("B");
		    break;
		}else{
		    turn = sb.charAt(0);
		    sb = sb.substring(1,sb.length());
		}
	    }else{
		if(sc.length() == 0){
		    System.out.println("C");
		    break;
		}else{
		    turn = sc.charAt(0);
		    sc = sc.substring(1,sc.length());
		}
	    }
	}
    }
}
