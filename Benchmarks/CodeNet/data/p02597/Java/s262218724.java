import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int K = s.nextInt();
	String C = s.next();

	int leftWcount = 0;
	int leftRcount = 0;
	int rightRcount = 0;
	int Wcount = 0;
	for(int i = 0; i < C.length(); i++){
		if(C.charAt(i) == 'R') break;
		leftWcount++;
	}
	for(int i = leftWcount; i < C.length(); i++){
		if(C.charAt(i) == 'W') break;
		leftRcount++;
	}
	for(int i = C.length()-1; i >= 0; i--){
		if(C.charAt(i) == 'R'){
			rightRcount++;
		}
		if(C.charAt(i) == 'W'){
			Wcount++;
		}
	}

	if(Wcount < rightRcount){
		System.out.println(Wcount);
	}else{
		System.out.println(Math.max(leftWcount, Math.abs(rightRcount-leftRcount)));
	}

    
  }
}