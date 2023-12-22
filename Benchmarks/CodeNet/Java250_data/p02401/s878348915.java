import java.io.*;

class Main {
	public static void main(String[] args){
		int a, b;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String buf = br.readLine();
			String[] line = buf.split(" ");
			
			a = Integer.parseInt(line[0]);
			String op = line[1];
			b = Integer.parseInt(line[2]);
			
			if(op.equals("?")) break;
			
			if(op.equals("+")) {
				System.out.println(a + b);
			} else if (op.equals("-")){
				System.out.println(a - b);
			} else if (op.equals("*")){
				System.out.println(a * b);
			} else if (op.equals("/")){
				System.out.println(a/b);
			}
		}
		} catch(Exception e){
		}
	}
}