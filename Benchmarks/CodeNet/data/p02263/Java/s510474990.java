import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
       // System.out.println("0".compareTo("1"));
		Deque<Integer> stack = new ArrayDeque<Integer>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line=br.readLine();
            String[] str=line.split(" ");
            
            for(int i=0;i<str.length;i++){
            	if(str[i].equals("+")){
            		int a=stack.pop()+stack.pop();
            		stack.push(a);
            	}else if(str[i].equals("-")){
            		int aa=stack.pop();
            		int bb=stack.pop();
            		int a=bb-aa;
            		stack.push(a);
            	}else if(str[i].equals("*")){
            		int aa=stack.pop();
            		int bb=stack.pop();
            		int a=aa*bb;
            		stack.push(a);
            	}else{
            		stack.push(Integer.parseInt(str[i]));
            	}
            }
            System.out.println(stack.pop());
        }
	}

}