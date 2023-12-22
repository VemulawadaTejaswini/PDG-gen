import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int reg = scan.nextInt();
	Queue<String> method = new LinkedList<String>();
	Queue<Integer> time = new LinkedList<Integer>();
	int i;
	int time0=0;
	for(i=0 ; i<n ; i++){
	    method.add(scan.next());
	    time.add(scan.nextInt());
	}

	while(method.size()>0){
	    if(time.peek() - reg>0){
		method.add(method.poll());
		time.add(time.poll() - reg);
		time0+=reg;
	    }

	    
	    else{
		time0+=time.poll();
		System.out.println(method.poll() + " " +time0);
	    }
	}
    }
}
		
	    

