import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String[] str=buf.readLine().split("\\s");
	Stack<Integer> box = new Stack<Integer>();
	int tmp1=0;
	int tmp2=0;
	for(int i=0;i<str.length;i++){
	   
	        switch (str[i]) {
            case "+":
                tmp1 = box.pop();
                tmp2 = box.pop();
                box.add(tmp2 + tmp1);
                break;
            case "-":
                tmp1 = box.pop();
                tmp2 = box.pop();
                box.add(tmp2 - tmp1);
                break;
            case "*":
                 tmp1 = box.pop();
                tmp2 = box.pop();
                box.add(tmp2 * tmp1);
                break;
            default:
                box.add(Integer.parseInt(str[i]));
            }

	    

						       
	}
	System.out.println(box.pop());
    }
 
}

