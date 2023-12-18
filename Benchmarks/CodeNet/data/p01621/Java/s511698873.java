import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
        new Main().start();
    }

	 public void start() throws Exception {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	          while(true){

	        	String line = br.readLine();
	        	line = line.trim();

	        	//INPUT NO OWARI
	        	if("0 0 0 None None 0 0".equals(line))
	        		return;

	        	String[] data  = line.split("[\\s]+");
	        	//DATA NO SEIKEI
	        	int s = Integer.parseInt(data[0]);
	        	int n = Integer.parseInt(data[1]);
	        	int t = Integer.parseInt(data[2]);
	        	String weekday = data[3];
	        	String Time = data[4];
	        	int p = Integer.parseInt(data[5]);
	        	int m = Integer.parseInt(data[6]);

	        	int border = 60 * 24 * 7;

	        	int daynum=0;
	        	switch(weekday){
	        	case "Sun":
	        		daynum = 0;
	        		break;
	        	case "Mon":
	        		daynum = 1;
	        		break;
	        	case "Tue":
	        		 daynum = 2;
	        		break;
	        	case "Wed":
	        		daynum = 3;
	        		break;
	        	case "Thu":
	        		daynum = 4;
	        		break;
	        	case "Fri":
	        		daynum = 5;
	        		break;
	        	case "Sat":
	        		daynum = 6;
	        		break;
	        	default:

	        		break;
	        	}


       	int max = 0;
	     for(int day= 0 ;day<7;day++)	{
	      	for(int time=0;time<60 * 24;time++){

	        	int count = 0;

	        	for(int kaisuu = 0; kaisuu < m; kaisuu++){

	        		if("All".equals(weekday)){
	        			switch(Time){
	        			case "All":
	        				count++;
	        				break;
	        		 	case "Day":
	        		 		if(time >= 6 * 60  &&  time +s <= 18 * 60){
	        		 			count++;
	        		 		}
	        		 		break;
	        		 	case "Night":
	        		 		if( time <=6*60 && time+s<=6*60 ){
	        		 			count++;
	        		 		}
	        		 		else if(time>=18*60 && (time+s) <=24*60){
	        		 			count++;
	        		 		}
	        		 		else if(time >= 18*60 && (time +s) % (24*60) <=6*60 ){
	        		 			count++;}
	        		 		break;

	        			}
	        		}
	        		else{
		       			switch(Time){
		        		 	case "All":
		        		 		if(day == daynum && (time + s) / (24*60) <1){
		          		 	    	count++;}
		    	        		     break;
		        		 	case "Day":
		        		 		if(day == daynum && time >= 6 * 60 && time +s <= 18 * 60)
		        		 		{
		        		 			count++;
		        		 		}
		        		 		break;
		        		 	case "Night":
		        		 		if( day==daynum && time <6*60 && time+s<6*60 ){
		        		 			count++;
		        		 		}
		        		 		else if( day ==daynum && time>18*60 && (time+s) <24*60 ){
		        		 			count++;
		        		 		}
//		        		 		else if(day == daynum && time >= 18*60 && (time +s) % (24*60) <=6*60 ){
	//	        		 			count++;}
		        		 		break;
		       			}
	        		}

	        	    time += t;
	        		if(time >= 24 * 60 )
	        		{
	        			time = time % (24 * 60);
	        			day = (day + 1) % 7;
	        		}

	        	}//t?????????????????????

	        	if(count > max)
	        		max=count;

	       	}//??????for??????
	       }//?????\for??????


	     double result=1;

	     for(int k =0;k<n*max;k++){
			result*=(double)(p-1)/(double)p;}

	       System.out.println(String.format("%.10f",1-result ));

	          }
	 }

	 }