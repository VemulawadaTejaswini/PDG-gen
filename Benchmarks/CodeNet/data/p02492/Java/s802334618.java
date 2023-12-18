import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String op = bf.readLine();
		int a = Integer.parseInt(op);
		int b = Integer.parseInt(op);
		switch(op){
		case "+" :	System.out.println(a + b);
					break;
		case "-" :	System.out.println(a - b);
					break;
		case "*" :  System.out.println(a * b);
					break;
		case "/" :	System.out.println(a / b);
					break;
		case "?" : 	break;
		} 
	}
}