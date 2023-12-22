/*package whatever //do not write package name here */

import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(),ans="";
		for(int i=0 ; i<str.length() ; i++){
		    if(str.charAt(i)=='1'){
		        ans+=9;
		    }else{
		        ans+=1;
		    }
		}
		System.out.println(ans);
	}
}