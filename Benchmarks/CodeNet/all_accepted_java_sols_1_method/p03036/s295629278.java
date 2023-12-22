import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int cr = sc.nextInt();
	int D = sc.nextInt();
	int x = sc.nextInt();
	for(int i = 0; i < 10; i++){
		x = cr*x - D;
		System.out.println(x);
		}
}
}
