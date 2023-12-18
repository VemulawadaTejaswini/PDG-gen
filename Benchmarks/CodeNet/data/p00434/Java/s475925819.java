import java.util.Arrays;
import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int num[] = new int[28];
	static boolean student[] = new boolean[30];
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}
	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		for(int i=0; i < 28; i++){
			num[i] = sc.nextInt();
		}
		
		return true;
	}
	
	public static void solve(){
		
		Arrays.fill(student, true);
		for(int i=0; i < num.length; i++){
			student[num[i]] = false;
		}
		
		for(int i=0; i < student.length; i++){
			if(student[i]) System.out.println(i+1);
		}
		
	}

}