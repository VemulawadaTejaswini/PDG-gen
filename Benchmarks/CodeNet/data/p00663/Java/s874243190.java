import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

// SAT-EN-3
// 2012/12/04
public class Main{
	Scanner sc=new Scanner(System.in);

	String line;

	void run(){
		for(;;){
			line=sc.nextLine();
			if(line.equals("#")){
				break;
			}
			boolean satensan=false;
			for(String s : line.split("[|]")){
				s=s.substring(1, s.length()-1);
				String[] ss=s.split("&");
				boolean fail=false;
				for(int j=0; j<3; j++){
					for(int i=0; i<3; i++){
						fail|=ss[i].length()==1&&ss[j].length()==2
								&&ss[i].charAt(0)==ss[j].charAt(1);
					}
				}
				satensan|=!fail;
			}
			println(satensan?"yes":"no");
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}