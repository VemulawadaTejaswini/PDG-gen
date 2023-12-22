import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int years = sc.nextInt();
	int fee = sc.nextInt();
	if(years < 6){
		fee = 0;
	}else if(years < 13 && years >= 6){
		fee = fee/2;
	}
	System.out.println(fee);
}
}
