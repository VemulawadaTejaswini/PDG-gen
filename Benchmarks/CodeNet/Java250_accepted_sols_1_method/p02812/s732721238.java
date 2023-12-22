import java.lang.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	String S = scanner.next();
	int count = 0;
	for(int i=0;i < n;i++){
	    if(S.charAt(i)=='A'&&i<n-2){
		if(S.substring(i,i+3).equals("ABC")) count++;
	    }
	}
	System.out.println(count);
    }
}
