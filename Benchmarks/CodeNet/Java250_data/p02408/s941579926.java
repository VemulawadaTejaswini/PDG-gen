import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	List<String> output = new ArrayList<String>();

	boolean[] spade=new boolean[13];
	boolean[] dia    =new boolean[13];
	boolean[] club    =new boolean[13];
	boolean[] heart    =new boolean[13];
	
	int n=stdin.nextInt();
for(int i=0;i<n;++i) {
		String markChar = stdin.next();
		int number = stdin.nextInt();		
		boolean[] mark=null;
		if(markChar.equals("S")) {
			mark=spade;
		}
		if(markChar.equals("H")) {
			mark=heart;
		}
		if(markChar.equals("C")) {
			mark=club;
		}
		if(markChar.equals("D")) {
			mark=dia;
		}
		mark[number-1]=true;
	}
	for(int i=0;i<spade.length;++i) {
	if(!spade[i]) {
		System.out.println("S "+(i+1));
	}		
	}
	for(int i=0;i<heart.length;++i) {
		if(!heart[i]) {
			System.out.println("H "+(i+1));
		}
	}
	for(int i=0;i<club.length;++i) {
		if(!club[i]) {
			System.out.println("C "+(i+1));
		}	
	}
	for(int i=0;i<dia.length;++i) {
		if(!dia[i]) {
			System.out.println("D "+(i+1));
		}	
	}
}
}