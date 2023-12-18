import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	private static final int NOT_COME_EXAM = -1;
	
	private Scanner sc;
	private ArrayList<String> result;
	
	public Main(){
		sc = new Scanner(System.in);
		result = new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		Main grading = new Main();
		grading.getAllGrades();
		grading.printAllGrades();
	}
	
	private String grading(int m, int f, int r){
		int sum = m + f;
		if( m == NOT_COME_EXAM || f == NOT_COME_EXAM){
			return "F";
		}
		else if(sum >= 80){
			return "A";
		}
		else if(sum >= 65){
			return "B";
		}
		else if(sum >= 50){
			return "C";
		}
		else if(sum >= 30){
			if(r >= 50){
				return "C";
			}
			else{
				return "D";
			}
		}
		else if(sum < 30){
			return "F";
		}
		return "F";
	}
	
	private void getGrade(int m, int f, int r){		
		result.add(grading(m, f, r));
	}
	
	private void getAllGrades(){
		int m = -1;
		int f = -1;
		int r = -1;
		
		while(sc.hasNextLine()){
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			if((m == -1) && (f == -1) && (r == -1)){
				break;
			}
			else{
				getGrade(m, f, r);
			}
		}
	}
	
	private void printAllGrades(){
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}