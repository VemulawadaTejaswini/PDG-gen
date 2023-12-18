import java.io.BufferedReader;                                                                     
import java.io.IOException;                                                                        
import java.io.InputStreamReader;                                                          
import java.util.ArrayDeque;                                                                     
import java.util.Deque;

//public class pop{
    public static void main(String args[]) throws IOException{
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String[] str=buf.readLine().split("\\s");

	Deque<Integer> box=new ArrayDeque<>();
	int tmp1=0;
	int tmp2=0;
	for(int i=0;i<str.length;i++){
	   
	        switch (str[i]) {
            case "+":
                tmp1 = box.pollFirst();
                tmp2 = box.pollFirst();
                box.addFirst(tmp2 + tmp1);
                break;
            case "-":
                tmp1 = box.pollFirst();
                tmp2 = box.pollFirst();
                box.addFirst(tmp2 - tmp1);
                break;
            case "*":
                 tmp1 = box.pollFirst();
                tmp2 = box.pollFirst();
                box.addFirst(tmp2 * tmp1);
                break;
            default:
                box.addFirst(Integer.parseInt(str[i]));
            }

	    

						       
	}
	System.out.println(box.pop());
    //}
 
}

