
import java.util.Scanner;

class Hantei{
	 int M;	//??????????¨??????°
	 int F;	//??????????¨??????°
	 int R;	//???????¨??????°
	 String G ;//????¨???????
	//---?????????????????????---//

	
	//---?????°?????\???---//
	void Inputscore(){
		Scanner scanner = new Scanner(System.in);
		M = scanner.nextInt();
		F = scanner.nextInt();
		R = scanner.nextInt();
		
	}
	
	//---?????°?????????---//
	String getGrading(){
		if( (M+F) >= 80 ){
			G = "A";
			return G;
		}
		else if( (M+F) >= 65){
			G = "B";
			return G;
		}
		else if( (M+F) >= 50){
			G = "C";
			return G;
		}
		else if( (M+F) >= 30){
			if( R >= 50 ){
				G = "C";
				return G;
			}
			G = "D";
			return G;
		}
		else {
			G = "F";
		}
		if(M == -1 && F == -1 && R == -1){
			G = "S";
		}
		return G;	
	}	
}


public class Main{
 
	
	
	public static void main(String[] args) {
		String[] s = new String[100000];
		int count = 0;
		while(true){
			Hantei score = new Hantei();
			score.Inputscore();
			s[count] = score.getGrading();
			if(s[count].equals("S")){break;}
			count++;
		}
		for(int i = 0; i < count ; i++){
			System.out.println(s[i]);
		}
		
		
	}

}