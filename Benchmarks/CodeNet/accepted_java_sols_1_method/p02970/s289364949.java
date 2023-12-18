import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		if(n%(2*d+1) == 0)
		System.out.println(n/(2*d+1));
		else
		System.out.println(n/(2*d+1)+1);
}
}
