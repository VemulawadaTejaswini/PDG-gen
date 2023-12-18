import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
	Scanner scan = new Scanner (System.in);
	int [] St = new int[100];
	int index = 0;

	while(scan.hasNext()){
		String data = scan.next();
		if(data == "+"){
			index--;
			int a = St[index];
			int b = St[index];
			St[index] = a + b;
			index++;
		}else if(data == "*"){
			index--; 
			int a = St[index];
			int b = St[index];
			St[index] = a * b;
			index++;
		}else if(data == "-"){
			index--;
			int a = St[index];
			int b = St[index];
			St[index] = a - b;
			index++;
		}else{
			St[index] = Integer.parseInt(data);
			index++;
		}
	}
	for(int i = 0; i < index; i++){
		System.out.println(St[--index]);
	}
  }
}