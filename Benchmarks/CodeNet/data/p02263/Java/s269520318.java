import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
	Scanner scan = new Scanner (System.in);
	int [] St = new int[100];
	int index = 0;
	int k;
	
	while(scan.hasNext()){
		String str = scan.next();
		switch(str){
		case '+':
			index--;
			St[index-1] += St[index];
			break;
		case '*':
			index--;
			St[index-1] *= St[index];
			break;
		case '-':
			index--;
			St[index-1] -= St[index];
                        break;
		default:
			St[index++] = Integer.parseInt(str);
			break;
		}
	}
	for(int i = 0; i < index; i++){
		System.out.println(St[i]);
	}
  }
}