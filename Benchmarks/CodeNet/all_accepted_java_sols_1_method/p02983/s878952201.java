import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	long l = Long.parseLong(sc.next());
	long r = Long.parseLong(sc.next());
	long min = (l*r)%2019;
	if((r - l) >= 2018){
		System.out.println(0);
	}else{
		for(long i = l; i < r; i++){
			for(long j = i+1; j < r+1; j++){
				if((j*i)%2019 < min){
					min = ((j*i)%2019);
				}
			}
		}
	System.out.println(min);
	}
}
}
