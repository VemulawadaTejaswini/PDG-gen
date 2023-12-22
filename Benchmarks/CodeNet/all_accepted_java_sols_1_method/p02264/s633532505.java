import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);

	int i;
	int n;
	int t;
	int gettime = 0;
	
	Queue<String> p = new LinkedList<String>();
	Queue<Integer> time = new LinkedList<Integer>();
	
	n = sc.nextInt();
	t = sc.nextInt();
	
	for(i=0; i<n; i++){
	    p.add(sc.next());
	    time.add(sc.nextInt());
	}
	
	while(0 < p.size()){
	    if(0 < (time.peek() - t)){
		p.add(p.poll());
		time.add(time.poll() - t);
		gettime = gettime + t;
	    }else{
		gettime = gettime + time.poll();
		System.out.println(p.poll() + " " + gettime);
	    }
	}
    }
}

