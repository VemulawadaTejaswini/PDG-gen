import java.util.Scanner;

public class Main {

public static void main(String args[]) {
	//o、x、空白をそれぞれ半角英小文字の o、x、s
	//oが勝ちなら半角英小文字の o を、xが勝ちなら半角英小文字の x を、引き分けならば半角英小文字の d を出力
	Scanner in = new Scanner(System.in);
	while(in.hasNext()) {	
	
	String text = in.next();
	
	char[] c = new char[9];
	for(int i=0; i<9; i++) {
		c[i]=text.charAt(i);
	}
	if(c[0]==c[1]&&c[1]==c[2]&&c[0]=='o'||c[3]==c[4]&&c[4]==c[5]&&c[3]=='o'||c[6]==c[7]&&c[7]==c[8]&&c[6]=='○') {
		System.out.println("o");
		continue;
	}else if((c[0]==c[1]&&c[1]==c[2]&&c[0]=='x')||(c[3]==c[4]&&c[4]==c[5]&&c[3]=='x')||(c[6]==c[7]&&c[7]==c[8]&&c[6]=='x')) {
		System.out.println("x");
		continue;
	}else if((c[0]==c[3]&&c[3]==c[6]&&c[0]=='x')||(c[1]==c[4]&&c[4]==c[7]&&c[1]=='x')||(c[2]==c[5]&&c[5]==c[8]&&c[2]=='x')) {
		System.out.println("x");
		continue;
	}else if((c[0]==c[3]&&c[3]==c[6]&&c[0]=='o')||(c[1]==c[4]&&c[4]==c[7]&&c[1]=='o')||(c[2]==c[5]&&c[5]==c[8]&&c[2]=='o') ){
		System.out.println("o");
		continue;
	}else if((c[0]==c[4]&&c[4]==c[8]&&c[0]=='o')||(c[2]==c[4]&&c[4]==c[6]&&c[2]=='o')) {
		System.out.println("o");
		continue;
	}else if((c[0]==c[4]&&c[4]==c[8]&&c[0]=='x')||(c[2]==c[4]&&c[4]==c[6]&&c[2]=='x')) {
		System.out.println("x");
		continue;
	}else {
		System.out.println("d");
	}
	
	
	
	}
	}
}