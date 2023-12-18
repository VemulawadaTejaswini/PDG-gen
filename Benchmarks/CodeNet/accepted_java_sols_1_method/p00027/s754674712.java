import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    int m, d;
	    while(true){
		String[] day= {"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
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
		System.out.println(day[d%7]);
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}