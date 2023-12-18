import java.io.*;


public class Main{
	public static void main(String args[]) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length/2; i++){
			output(Integer.parseInt(""+ch[i*2]),ch[i*2+1]);
		}
		System.out.println();
	}

	static void output(int i, char c){
		switch(i){
		case 0:
			if(c == 'T'){
				System.out.print("wa");
			}else if(c == 'U'){
				System.out.print("nn");
			}else if(c == 'D'){
				System.out.print("wo");
			}
			return;
		case 1:
			break;
		case 2:
			System.out.print("k");
			break;
		case 3:
			System.out.print("s");
			break;
		case 4:
			System.out.print("t");
			break;
		case 5:
			System.out.print("n");
			break;
		case 6:
			System.out.print("h");
			break;
		case 7:
			System.out.print("m");
			break;
		case 8:
			System.out.print("y");
			break;
		case 9:
			System.out.print("r");
			break;
		}
		switch(c){
		case 'T':
			System.out.print("a");
			return;
		case 'L':
			System.out.print("i");
			return;
		case 'U':
			System.out.print("u");
			return;
		case 'R':
			System.out.print("e");
			return;
		case 'D':
			System.out.print("o");
			return;
		}
	}
}