import java.util.*;
import java.io.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String[] readLine = new String[2];
	static boolean A = true, B = false, C = false, temp = false;
	static char condition1, condition2;
	public static void main(String[] args) {
		while(read()){
			slove();
		}
		print();
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		readLine = sc.next().split(",");
		condition1 = readLine[0].charAt(0);
		condition2 = readLine[1].charAt(0);
		return true;
	}
	static void slove(){
		if(condition1 == 'A' && condition2 == 'B'){
			temp = A; A = B; B = temp;
		}else if(condition1 == 'A' && condition2 == 'C'){
			temp = A; A = C; C = temp;
		}else if(condition1 == 'B' && condition2 == 'C'){
			temp = B; B = C; C = temp;
		}else if(condition1 == 'B' && condition2 == 'A'){
			temp = B; B = A; A = temp;
		}else if(condition1 == 'C' && condition2 == 'A'){
			temp = C; C = A; A = temp;
		}else if(condition1 == 'C' && condition2 == 'B'){
			temp = C; C = B; B = temp;
		}
	}
	static void print(){
		if(A == true){
			System.out.println("A");
		}else if(B == true){
			System.out.println("B");
		}else if(C == true){
			System.out.println("C");
		}
	}
}