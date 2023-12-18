import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] augs){

	int s, h=0, m=0, a = 0, a1 = 0;

	Scanner scan = new Scanner(System.in);

	s = Integer.parseInt(scan.next());

	if(s < 86400 && s >= 0){
		if(s >= 3600){	
	    		h = (int)s/3600;
			a = (int)s % 3600;
		}else{
			a = (int)s;
		}

		if(s >= 60){
			m = (int)a/60;
			a1 = (int)a % 60;
		}else{
			a1 = (int)a;
		}

		s = (int)a1;

		System.out.println(h + ":" + m +":"+ s);
	
	}

	}
}