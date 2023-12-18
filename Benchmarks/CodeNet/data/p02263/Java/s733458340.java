import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args){
		
	Scanner scan = new Scanner (System.in);
	int [] St = new int[100];
	int index = 0;

	while(scan.hasNext()){
		String data = scan.next();
		if("+".equals(data)){
			index--;
			int a = St[index];
			int b = St[index];
			St[index++] = a + b;
		}else if("*".equals(data)){
			index--; 
			int a = St[index];
			int b = St[index];
			St[index++] = a * b;
		}else if("-".equals(data)){
			index--;
			int a = St[index];
			int b = St[index];
			St[index++] = a - b;
		}else{
			St[index++] = Integer.parseInt(data);
		}
	}
	for(int i = 0; i < index; i++){
		System.out.println(St[i]);
	}
  }
}