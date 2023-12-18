
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class kadai14_1 {


	 public static void main(String args[] ) throws Exception {

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

	        	int daynum;
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
	        		daynum = 999;
	        			break;

	        	}

	        	int starttime;
	        	int endtime;

	        	switch(Time){
	        	case "All":
	        		starttime = 0;
	        		endtime = 24 * 60;
	        		break;
	        	case "Day":
	        		starttime = 6 * 60;
	        		endtime = 18 * 60 ;
	        		break;
	        	case "Night":
	        		starttime = 18 * 60;
	        		endtime =  6 * 60;
	        		break;
	        	default:
	        		starttime = 99999;
	        		endtime =  99999;
	        		break;

	        	}



	        	double max = 0;

	     for(int i= 0 ;i<6;i++)	{
	      	for(int j=0;j<60 * 24;j++){

	      	int day = i;
	       	int time = j;



	        	double result = 1;

	        	for(int kaisuu = 0; kaisuu < m;kaisuu ++){

	        		time += s;

	        		if(time > 24 * 60 )
	        		{
	        			time = time - 24 * 60;
	        			day++;
	        		}
	        		if(day > 6)
	        			day = 0;


	        		if("All".equals(weekday)){
	        			if( ("Day".equals(Time) && time >= starttime && time <= endtime) ||
	        					("Night".equals(Time) && time >= starttime) ||
	        					("Night".equals(Time) && time <= endtime) ||
	        					"All".equals(Time)
	        		  		){
	        				for(int k = 0;k<n;k++){
	        					//System.out.println(k);
	        					result *=  ((double)p-1)/(double)p;}
	        			}


	        		}
	        		else if(day == daynum){
	        			if( ("Day".equals(Time) && time >= starttime && time <= endtime) ||
	        					("Night".equals(Time) && time >= starttime) ||
	        					"All".equals(Time)
	        				){
	        				for(int k = 0;k<n;k++)	{
	        				//	System.out.println(k);
	        					result *=  ((double)p-1)/(double)p;}

	        			}
	        		}
	        		else if(day -1 == daynum || day + 6 ==daynum){
	        			if("Night".equals(Time) && time <= endtime){
	        				for(int k = 0;k<n;k++)	{
	        			//		System.out.println(k);
	        					result *=  ((double)p-1)/(double)p;}

	        			}
	        				//	        			result *= 1 - ( (double)n/(double)p );
	        		}

	        		/*

	        		if("All".equals(Time) || "Day".equals(Time)){
	        			if(day == daynum || "All".equals(weekday)){
	        				if(time >= starttime && time <= endtime){
	        					result = culculation(n,p,result);
	        				}}
	        		}else if("Night".equals(Time)){
	        			if((day == daynum || "All".equals(weekday) )&& time >= starttime){
        					for(int k=0;k<n;k++)
        						result = culculation(n,p,result);}
	        			else if( (day -1 == daynum ||"All".equals(weekday) )&& time <= endtime){
        					for(int k=0;k<n;k++)
        						result = culculation(n,p,result);}
	        			else if( day + 6 == daynum && time <= endtime){
        					for(int k=0;k<n;k++)
        						result = culculation(n,p,result);}	        				//result *= 1 - ( (double)n/(double)p );


	        		}      			    	               		*/
	        		time += t - s;
	        		if(time > 24 * 60 )
	        		{
	        			time = time - 24 * 60;
	        			day++;
	        		}
	        		if(day > 6)
	        			day = 0;


	        	}//t?????????????????????


	        	result = 1 - result;
	        	if(result > max)
	        		max =result;

	       	}//??????for??????
	       }//?????\for??????

	        System.out.println(String.format("%.10f", max));

	          }//while??????


	 }

}