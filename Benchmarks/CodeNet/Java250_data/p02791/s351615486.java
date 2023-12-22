import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
//map.containsKey(A)
//Map<String, Integer> map = new HashMap<String, Integer>(n);
//ArrayList<String> cc = new ArrayList<>(n);
//Collections.sort(list);
//Array.sort(list);
//Arrays.asList(c).contains("a")

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	int N=sc.nextInt();
	int p[]=new int[N];
	int min=0;
	int ctn=0;
	for(int i=0;i<N;i++) {
		p[i]=sc.nextInt();
		if(i==0) {
			min=p[i];
		}
		if(min>=p[i]) {
			min=p[i];
			ctn++;
		}
	}
	
	p(ctn);
	
 }
	static boolean te() {
		
		
		
		return true;
	}
}
