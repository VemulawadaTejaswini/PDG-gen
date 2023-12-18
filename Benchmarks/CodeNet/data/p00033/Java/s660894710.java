import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	private static       boolean flg     = false;
	private static       int     index   = 0;
	private static final boolean SUCCESS = true;
	private static final int     EMPTY   = -1,
			                     END     = 10;

	private static int[]               pipe_A = new int[10];
	private static ArrayDeque<Integer> pipe_B = new ArrayDeque<Integer>(),
                                       pipe_C = new ArrayDeque<Integer>();

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
    	int n = sc.nextInt();

    	String[] s;
    	for(int i=0;i<n;i++){
    		s = sc.next().split("\\s");
    		for(int j=0;j<10;j++){pipe_A[j] = Integer.parseInt(s[j]);}
    		pipe_B.clear();
    		pipe_C.clear();
    		pipe_B.add(EMPTY);
    		pipe_C.add(EMPTY);
    		flg = false;
    		index = 0;
    		push('B');
			if   (flg){System.out.println("YES");}
			else      {System.out.println("NO"); }
    	}
    }

    private static void push(char pipe){

//    	System.out.println("index:" + index);
//    	System.out.print("pipe_B:");
//    	for(int i:pipe_B){System.out.print(i + " ");}
//    	System.out.println();
//    	System.out.print("pipe_C:");
//    	for(int i:pipe_C){System.out.print(i + " ");}
//    	System.out.println();
//
    	if(flg){return;}
    	if(index == END){
    		flg = SUCCESS;
    		return;
   		}
    	int ball = pipe_A[index];
    	switch (pipe) {
    		case 'B': {
    			if(pipe_B.peek() < ball ){
    				pipe_B.push(ball);
//    				System.out.println("B:push: index : " + index);
//    				System.out.println("B:ball : " + ball);
//    				System.out.println((pipe_B.peek()));
    		    	index++;
    		    	break;
    			} else {
    				return;
    			}
   			}
    		case 'C': {
    			if(pipe_C.peek() < ball){
    				pipe_C.push(ball);
//    				System.out.println("C:push: index : " + index);
//    				System.out.println("C:ball : " + ball);
//    				System.out.println((pipe_C.peek()));
    				index++;
    				break;
    			} else {
    				if(index == 0){return;}
    				if     (pipe_A[index - 1] == pipe_B.peek()){pipe_B.pop();}
    				else if(pipe_A[index - 1] == pipe_C.peek()){pipe_C.pop();}
    				index--;
    				return;
    			}
    		}
    	}
		push('B');
		push('C');
    }
}