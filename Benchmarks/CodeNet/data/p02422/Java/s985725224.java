import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder str = new StringBuilder(scan.next());	//文字列入力
        int count = scan.nextInt();	//命令回数入力

        for(int i=0; i<count; i++) {

        	String com = scan.next();

    		int a = scan.nextInt();	//入力
    		int b = scan.nextInt() + 1;	//入力

        	switch(com) {

        	case "print":

        		System.out.println(str.substring(a, b));
        		break;

        	case "replace":

        		String p = scan.next();
        		str.replace(a,b, p);
        		break;

        	case "reverse":

        		String c = str.substring(a, b);
        		StringBuilder str2 = new StringBuilder(c);
        		str2.reverse();
        		str.replace(a,b,str2.toString());
        		break;

        	}

        }
    }
}
