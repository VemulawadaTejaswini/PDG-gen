import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] lineKNQ = sc.nextLine().split(" ");
    	int intPersons = Integer.parseInt(lineKNQ[0]);
    	int initScore = Integer.parseInt(lineKNQ[1]);
    	int countMatch = Integer.parseInt(lineKNQ[2]);
    	
    	int Scores[] = new int[intPersons];
    	for(int i = 0;i<intPersons;i++) {
    		Scores[i] = 0;
    	}
    	for(int i =1;i<=countMatch;i++) {
    		int winner = Integer.parseInt(sc.nextLine());
    		Scores[winner -1]++;
    	}
    	for(int i = 0;i<intPersons;i++) {
    		int tmp = Scores[i] - countMatch + initScore;
    		if(tmp > 0) {
    			System.out.println("Yes");
    		}else {
    			System.out.println("No");
    		}
    	}
    }
}