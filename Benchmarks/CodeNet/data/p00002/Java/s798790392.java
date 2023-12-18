import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public String[] inputLine = new String[200];
	public int[] numberA = new int[200];
	public int[] numberB = new int[200];
	
	public static void main(String args[])throws IOException{
		Main app = new Main();
		
		app.input();
		app.output();
	}
	
	public void input()throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int i;
		for(i=0;i<3;i++)
			inputLine[i] = br.readLine();
		for(i=0;i<3;i++){
			String[] splitLine = inputLine[i].split(" ");
			numberA[i] = Integer.parseInt(splitLine[0]);
			numberB[i] = Integer.parseInt(splitLine[1]);
		}
	}
	
	public int addNumber(int current){
		int num;
		num = numberA[current] + numberB[current];
		
		return num;
	}
	
	public int count(int current){
		int tmp;
		int countNum=1;
		
		tmp = addNumber(current);
		while(tmp >= 10){
			countNum++;
			tmp/=10;
		}
		return countNum;
	}
	
	public void output(){
		int i;
		for(i=0;i<3;i++){
			System.out.println(count(i));
		}
	}
}