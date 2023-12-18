import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);;

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		String line=sc.nextLine();
		String s="";
		LinkedList<String> list=new LinkedList<String>();
		for(char c : line.toCharArray()){
			if(c==' '||c=='.'||c==','){
				if(s.length()>=3&&s.length()<=6){
					list.add(s);
				}
				s="";
			}else{
				s+=c;
			}
		}
		if(s.length()>=3&&s.length()<=6){
			list.add(s);
		}
		for(int i=0; i<list.size(); i++){
			print(list.get(i)+(i==list.size()-1?"\n":" "));
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}