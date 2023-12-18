import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	while(true){
	String[] st = sc.readLine().split(" ");
	int a = Integer.valueOf(st[0]),b = Integer.valueOf(st[1]),c = Integer.valueOf(st[2]);
	if(a==-1 && b==-1 && c==-1)
		break;
	
	boolean flag = false;
	root:
	for(int i=2; i<16; i++){
		String p = Integer.toString(a, i);
		if(p.matches("[0-9]+")){
			int num = Integer.valueOf(p);
			if(num==b){
				flag = true;
				break root;
			}
		}
	}
	if(!flag){
		System.out.println(-1);
		continue;
	}
	int min = Integer.MAX_VALUE;
	for(int i=2; i<=16; i++){
		String p = Integer.toString(c, i);
		if(p.matches("[0-9]+")){
			int num = Integer.valueOf(p);
			if(num >= c-a+b-1)
				min = Math.min(min, num);
		}
	}
	if(min == Integer.MAX_VALUE)
		System.out.println(-1);
	else
		System.out.println(min);
	}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}