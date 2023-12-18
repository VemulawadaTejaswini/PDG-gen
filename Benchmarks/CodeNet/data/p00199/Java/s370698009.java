import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char[] chairs;
	//Scanner scan = new Scanner(System.in);

	public Main(){

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}

	private void start() {
		while(true){
			chairs = null;
			String[] strArray = inputArray();
			if(strArray[0].equals("0") && strArray[1].equals("0")){
				break;
			}
			chairs = new char[Integer.parseInt(strArray[0])];
			for(int i=0;i<chairs.length;i++){
				chairs[i] = '#';
			}
			for(int i=0;i<Integer.parseInt(strArray[1]);i++){
				switch(input()){
				case 'A':
					operationA();
					break;
				case 'B':
					operationB();
					break;
				case 'C':
					operationC();
					break;
				case 'D':
					operationD();
					break;
				}
				/*
				if(input() == 'A'){
					operationA();
				}else if(input() == 'B'){
					operationB();
				}else if(input() == 'C'){
					operationC();
				}else if(input() == 'D'){
					operationD();
				}
				 */
			}
			for(int i=0;i<chairs.length;i++){
				System.out.print(chairs[i]);
			}
			System.out.print("\n");
		}
	}

	private void operationA() {
		for(int i=0;i<chairs.length;i++){
			if(chairs[i] == '#'){
				chairs[i] = 'A';
				return;
			}
		}
	}

	private void operationB() {
		for(int i=chairs.length-1;0<=i;i--){
			if(chairs[i] == 'A'){
				i--;
			}else if(chairs[i] == '#'){
				if(0<i){
					if(chairs[i-1] == 'A'){
						i -= 2;
					}else{
						chairs[i] = 'B';
						return;
					}
				}else{
					for(int j=0;j<chairs.length;j++){
						if(chairs[j] == '#'){
							chairs[j] = 'B';
							return;
						}
					}
				}
			}
		}
	}

	private void operationC() {
		for(int j=0;j<chairs.length-1;j++){
			if(chairs[j] != '#'){
				if(j<chairs.length-2 && chairs[j+1] == '#'){
					chairs[j+1] = 'C';
					return;
				}else{
					if(0<j){
						if(chairs[j-1] == '#'){
							chairs[j-1] = 'C';
							return;
						}
					}
				}
			}
		}
		if(chairs.length%2==0){
			chairs[chairs.length/2] = 'C';
		}else{
			chairs[(chairs.length+1)/2-1] = 'C';
		}
	}

	private void operationD() {
		int max = 0;
		int x1 = 0;
		int x2 = 0;
		for(int i=0;i<chairs.length;i++){
			if(chairs[i] != '#'){
				x1 = x2;
				x2 = i;
				if(max < x2-x1){
					max = x2-x1;
				}
			}
		}
		if(max < chairs.length-x2){
			max = chairs.length-x2;
		}
		if(max == 0){
			chairs[0] = 'D';
		}else{
			chairs[(x1+x2)/2] = 'D';
		}
	}

	private char input() {
		String str = null;
		try{
			str = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return str.charAt(0);
	}

	private String[] inputArray() {
		String str = null;
		String[] strArray = null;
		try{
			str = br.readLine();
			strArray = str.split("[\\s]+");
		}catch(IOException e){
			e.printStackTrace();
		}
		return strArray;
	}

}