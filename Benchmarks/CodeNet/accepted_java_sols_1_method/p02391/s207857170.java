
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	String[] str2 = str.split(" ",0);
	int num1 = Integer.parseInt(str2[0]);
	int num2 = Integer.parseInt(str2[1]);
	if (num1==num2) {
	    System.out.println("a == b");
	}
	else if(num1<num2){
	    System.out.println("a < b");
	}
	else{
	    System.out.println("a > b");

	}
       

    }
}