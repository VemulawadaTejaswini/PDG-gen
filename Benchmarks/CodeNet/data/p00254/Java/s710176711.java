import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	while(true){
	String st = sc.readLine();
	if(st.equals("0000"))
		break;
	if(st.charAt(0)==st.charAt(1) && st.charAt(1)==st.charAt(2) && st.charAt(2)==st.charAt(3))
		System.out.println("NA");
	else{
	int num = 0;
	while(!st.equals("6174")){
	char[] ini = st.toCharArray();
	Arrays.sort(ini);
	String s = new StringBuilder().append(ini[0]).append(ini[1]).append(ini[2]).append(ini[3]).toString();
	String l = new StringBuilder().append(ini[3]).append(ini[2]).append(ini[1]).append(ini[0]).toString();
	int now = Integer.valueOf(l)-Integer.valueOf(s);
	st = Integer.toString(now);
	num++;
	}
	System.out.println(num);
	}
	}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}