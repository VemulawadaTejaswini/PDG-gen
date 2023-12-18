import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    int m, d;
	    while(true){
		String day;
		String[] st = sc.readLine().split(" ");
		m = Integer.valueOf(st[0]);
		d = Integer.valueOf(st[1]);
		if(m==0 && d==0)
		    break;
		if(m>1){
		    d+=31;
		    if(m>2){
			d+=29;
			if(m>3){
			    d+=31;
			    if(m>4){
				d+=30;
				if(m>5){
				    d+=31;
				    if(m>6){
					d+=30;
					if(m>7){
					    d+=31;
					    if(m>8){
						d+=31;
						if(m>9){
						    d+=30;
						    if(m>10){
							d+=31;
							if(m>11)
							    d+=30;
						    }}}}}}}}}}
		if(d%7==1)
		    day="Thursday";
		else if(d%7==2)
		    day="Friday";
		else if(d%7==3)
		    day="Saturday";
		else if(d%7==4)
		    day="Sunday";
		else if(d%7==5)
		    day="Monday";
		else if(d%7==6)
		    day="Tuesday";
		else
		    day="Wednesday";
		System.out.println(day);
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}