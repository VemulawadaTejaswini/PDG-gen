
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{
	
	private static final int EXIST = 1;
	private static final int NOT_EXIST = 0;
	
	private static int[][] surface = new int[8][8];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<String>();
		
		try{
			while(true){
				initializeSurface();
				setSurface();
				result.add(getFigureType());
				String str = sc.nextLine();	//Enterの入力を受け取って捨てる
			}
		}catch(NoSuchElementException e){
			//何もせずに結果の出力に移る
		}

		
		for(String str : result){
			System.out.println(str);
		}
	}
	
	private static void initializeSurface(){
		for(int y = 0; y < 8; y++){
			for(int x = 0; x < 8; x++){
				surface[y][x] = NOT_EXIST;
			}
		}
	}
	
	public static void setSurface() throws NoSuchElementException{
		for(int i = 0; i < 8; i++){
			String input = sc.nextLine();
			for(int j = 0; j < 8; j++){
				surface[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
			}
		}
	}
	
	private static int getFirstBlockX(){
		for(int y = 0; y < 8; y++){
			for(int x = 0; x < 8; x++){
				if(surface[y][x] == EXIST){
					return x;
				}
			}
		}
		return -1;
	}
	
	private static int getFirstBlockY(){
		for(int y = 0; y < 8; y++){
			for(int x = 0; x < 8; x++){
				if(surface[y][x] == EXIST){
					return y;
				}
			}
		}
		return -1;
	}
	
	private static boolean isFigureA(){
		int firstBlockX = getFirstBlockX();
		int firstBlockY = getFirstBlockY();
		int numBlocks = 0;
		
		if(surface[firstBlockY][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 1][firstBlockX] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 1][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		
		if(numBlocks == 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isFigureB(){
		int firstBlockX = getFirstBlockX();
		int firstBlockY = getFirstBlockY();
		int numBlocks = 0;
		
		if(surface[firstBlockY + 1][firstBlockX] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 2][firstBlockX] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 3][firstBlockX] == EXIST){
			numBlocks++;
		}
		
		if(numBlocks == 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isFigureC(){
		int firstBlockX = getFirstBlockX();
		int firstBlockY = getFirstBlockY();
		int numBlocks = 0;
		
		if(surface[firstBlockY][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY][firstBlockX + 2] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY][firstBlockX + 3] == EXIST){
			numBlocks++;
		}
		
		if(numBlocks == 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isFigureD(){
		int firstBlockX = getFirstBlockX();
		int firstBlockY = getFirstBlockY();
		int numBlocks = 0;
		
		if(firstBlockX == 0){
			return false;
		}
		if(surface[firstBlockY + 1][firstBlockX] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 1][firstBlockX - 1] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 2][firstBlockX - 1] == EXIST){
			numBlocks++;
		}
		
		if(numBlocks == 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isFigureE(){
		int firstBlockX = getFirstBlockX();
		int firstBlockY = getFirstBlockY();
		int numBlocks = 0;
		
		if(surface[firstBlockY][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 1][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 2][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		
		if(numBlocks == 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isFigureF(){
		int firstBlockX = getFirstBlockX();
		int firstBlockY = getFirstBlockY();
		int numBlocks = 0;
		
		if(surface[firstBlockY + 1][firstBlockX] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 1][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 2][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		
		if(numBlocks == 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static boolean isFigureG(){
		int firstBlockX = getFirstBlockX();
		int firstBlockY = getFirstBlockY();
		int numBlocks = 0;
		
		if(firstBlockX == 0){
			return false;
		}
		if(surface[firstBlockY][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 1][firstBlockX] == EXIST){
			numBlocks++;
		}
		if(surface[firstBlockY + 1][firstBlockX + 1] == EXIST){
			numBlocks++;
		}
		
		if(numBlocks == 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static String getFigureType(){
		if(isFigureA())				return "A";
		else if(isFigureB())		return "B";
		else if(isFigureC())		return "C";
		else if(isFigureD())		return "D";
		else if(isFigureE())		return "E";
		else if(isFigureF())		return "F";
		else if(isFigureG())		return "G";
		return "no figure";
	}
	
	public static void printSurface(){
		for(int x = 0; x < 8; x++){
			for(int y = 0; y < 8; y++){
				if(surface[x][y] == EXIST){
					System.out.print("■");
				}
				else{
					System.out.print("□");
				}
			}
			System.out.println();
		}
	}
}