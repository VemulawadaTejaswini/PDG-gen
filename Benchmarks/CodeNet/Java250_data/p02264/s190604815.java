import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String args[]) throws IOException{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String[] string =  br.readLine().split(" ");
      int n = Integer.parseInt (string[0]);
	  int Quantum = Integer.parseInt(string[1]);

	  Queue queue = new Queue();
	  queue.initialize();

	  for(int i = 0;i < n; i++){
		  String date =  br.readLine();
		  queue.enqueue(date);
	  }

	  int pasttime = 0;
	  while( queue.isEmpty() == false){
          String[] tmpstring = queue.dequeue().split(" ");
          //System.out.println(tmpstring[0]+ " " + tmpstring[1]);
          int tmptime = Integer.parseInt(tmpstring[1]);

          if( tmptime > Quantum ){
              pasttime += Quantum;
              String time = String.valueOf( tmptime - Quantum);
              queue.enqueue(tmpstring[0]+" "+time);

          }
          else{
        	  pasttime += tmptime;
        	  System.out.println(tmpstring[0]+" "+pasttime);
          }
	  }

 }
}

class Queue{
    int head , tail;
    int MAX = 100000;
    String[] Q = new String[MAX];


    void initialize(){
    	head = tail = 0;
    }

    boolean isEmpty(){
    	return head == tail;
    }

    boolean isFull(){
    	return  head == (tail + 1) % MAX;
    }

    void enqueue(String x){
    	if( isFull() ){
    		System.out.println(" ??¨?????????????????????????????????");
    	}
    	 Q[tail] = x;

    	if(tail + 1 == MAX){
    		 tail = 0;
    	}else{
    		 tail++;
    	}

    }

    String dequeue(){
    	if( isEmpty() ){
    		System.out.println(" ??¨???????????¢?????????????????????");
    	}
    	String x = Q[head];

    	if(head + 1 == MAX){
    		head = 0;
   	    }else{
   	     head++;
   	    }
        return x;
    }
}