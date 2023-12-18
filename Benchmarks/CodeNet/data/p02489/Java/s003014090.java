import java.io.*;
import java.util.*;
class Main{
	public static void print(Object o){
		System.out.println(o);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i[] = new int [100000];
		int j = 1;
		int n = 1;
		i[n] = 1;
		while(true){
			i[n] = in.nextInt();
			if(i[n] == 0){
				break;
			}else{
				print("Case "+n+": "+i[n]);
				n++;
				j++;
			}
		}
	}
}