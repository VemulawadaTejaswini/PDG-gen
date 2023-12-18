import java.io.*;

class Main{

    public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String tmp;
	
	while((tmp = br.readLine()) != null){
	    String[] input = tmp.split(" ");
	    int a = Integer.parseInt(input[0]);
	    String op = input[1];
	    int b = Integer.parseInt(input[2]);
	    int result = 0;

	    if(op.equals("?")){
		break;
	    }
		
	    if(op.equals("+")){
		result = a + b;
	    }else if(op.equals("-")){
		result = a - b;
	    }else if(op.equals("*")){
		result = a * b;
	    }else if(op.equals("/")){
		result = a / b;
	    }else{
		System.out.println("error");
	    }

	    System.out.printf("%d\n", result);
	}
	
    }

}