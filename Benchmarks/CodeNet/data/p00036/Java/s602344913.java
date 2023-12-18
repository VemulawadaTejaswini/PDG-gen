import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		
		char N[][] = new char[8][8];
		String n[] = new String[8];
		String Decision = null;
		int ContinueOrEnd = 0;
		for(int i = 0 ; i < 8 ; i++){
			n[i] = scan.next();
			char Substitution[] = n[i].toCharArray();
			for(int j = 0; j < 8 ;j++){
				N[i][j] = Substitution[j];
			}
		}
		int i = 0;
		int j = 0;
		for(i = 0 ; i < 8 ; i++){
			for(j = 0 ; j < 8 ; j++){
				if(N[i][j] == '1'){
					ContinueOrEnd = 1;
					break;
				}
			}
			if(ContinueOrEnd == 1){
				break;
			}
		}
		++j;
		if(N[i][j] == '1'){
			++j;
			if(N[i][j] == '1'){
				Decision = "C";
			}else{
				j-=3;
				++i;
				if(N[i][j] == '1'){
					Decision = "G";
				}else{
					++j;
					if(N[i][j] == '1'){
						Decision = "A";
					}else{
						Decision = "E";
					}
				}
			}
		}else{
			j-=2;
			++i;
			if(N[i][j] == '1'){
				Decision = "D";
			}else{
				j+=2;
				if(N[i][j] == '1'){
					Decision = "F";
				}else{
					Decision = "B";
				}
			}
		}
		System.out.println(Decision);
	}
}