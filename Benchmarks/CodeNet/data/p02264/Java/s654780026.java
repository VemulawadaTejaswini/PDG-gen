

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String[] string =  br.readLine().split(" ");
	 int n = Integer.parseInt( string[0] );
     int quantum = Integer.parseInt( string[1] );

	  Process[] queue = new Process[n];
      for(int i = 0;i < n;i++){
    	  String[] info =  br.readLine().split(" ");

    	  queue[i] = new Process();
    	  queue[i].name = info[0];
    	  queue[i].time = Integer.parseInt( info[1] );
    	  queue[i].finishtime = 0;

      }



      for(int finishqueue = 0 , i = 0 , pasttime = 0; finishqueue != n; i++){

          if(i == n){
        	  i = 0;
          }

    	  if( queue[i].time > quantum ){
    		  pasttime = pasttime + quantum;
    		  queue[i].time =  queue[i].time - quantum;
    	  }
    	  else if( queue[i].time == 0 ){
          }
    	  else if(queue[i].time <= quantum){
    		  pasttime = pasttime + queue[i].time;
    		  queue[i].finishtime = pasttime;
    		  queue[i].time = 0;
    		  System.out.println(queue[i].name +" "+ queue[i].finishtime);
    		  finishqueue++;
    	  }

      }


 }
}

class Process{
	String name;
    int time  ;
    int finishtime;


}