import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	long l = Integer.parseInt(sc.next());
	long r = Integer.parseInt(sc.next());
	long min = 2019;
	if((r - l) >= 673){
		System.out.println(0);
	}else{
		for(long i = l; i < r; i++){
			for(long j = i+1; j <= r; j++){
				if((j*i)%2019 < min){
					min = ((j*i)%2019);
				}
			}
		}
	System.out.println(min);
	}
}
}
