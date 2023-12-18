import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int H;
	int W;
	int i , j , k;
	String[] weather;
	char[][] weatherArray;
	int[][] count;
	
	void input(){
		H = sc.nextInt();
		W = sc.nextInt();
		weather = new String[H];
		weatherArray = new char[H][W];
		for(i = 0 ; i < H ; i++){
			weather[i] = sc.next();
		}
		for(i = 0 ; i < H ; i++){
			for(j = 0 ; j < weather[i].length() ; j++){
				weatherArray[i][j] = weather[i].charAt(j);
			}
		}
	}
	
	void content1(int i){
		if(weatherArray[i][0] == 'c'){
			count[i][0] = 0;
			return;
		}else if(weatherArray[i][0] == '.'){
			count[i][0] = -1;
			return;
		}
	}
	
	void content2(int i , int j){
		if(weatherArray[i][j] == 'c'){
			count[i][j] = 0;
			return;
		}else if(weatherArray[i][j] == '.'){
			for(k = 1 ; k < j + 1 ; k++){
				count[i][j]++;
				if(weatherArray[i][j - k] == 'c'){
					return;
				}
				if(count[i][j] == j){
					count[i][j] = -1;
					return;					}
				}
		}
		
	}
	
	void process1(){
		count = new int[H][W];
		for(i = 0 ; i < H ; i++){
			content1(i);
		}
	}	
	
	void process2(){
		for(i = 0 ; i < H ; i++){
			for(j = W - 1 ; j > 0  ; j--){
				content2(i,j);
			}
		}
	}
		
	void output(){
		for(i = 0 ; i < H ; i++){
			for(j = 0 ; j < W ; j++){
				System.out.print(count[i][j]);
				if(j + 1 != W){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	void doIt(){
		input();
		process1();
		process2();
		output();
	}
	
	public static void main(String[] args){
		new Main() . doIt();	
	}
	
}