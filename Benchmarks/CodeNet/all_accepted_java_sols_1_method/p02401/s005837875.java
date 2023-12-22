import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean end=false;
		while(!end){
			String[] array = br.readLine().split(" ");
	        int a = Integer.parseInt(array[0]);
	        int b = Integer.parseInt(array[2]);
	        switch(array[1].charAt(0)){
	        case '+':
	        	System.out.println(a+b);
	        	break;
	        case '-':
	        	System.out.println(a-b);
	        	break;
	        case '*':
	        	System.out.println(a*b);
	        	break;
	        case '/':
	        	System.out.println(a/b);
	        	break;
	        default:
	        	end=true;
	        	break;
	        }
		}
	}
}