import java.io.PrintWriter;
import java.util.*;

import static java.lang.Math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		PrintWriter out=new PrintWriter(System.out);
		while(sc.hasNext()){
			int count=1;
			int input=sc.nextInt();
			for(int i=2;i<=input;i++){
				if(judge(i))count++;
			}
			System.out.println(count);
		}

	}
	static boolean judge(int temp){
		boolean judge=true;
		if(temp%2!=0){
			for(int i=3;i<temp;i++){
				if(temp%i==0){
					judge=false;
					break;
				}
			}
		}else judge=false;
		return judge;
	}

}