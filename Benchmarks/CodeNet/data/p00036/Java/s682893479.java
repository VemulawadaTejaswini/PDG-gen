import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		
		String N[][] = new String[8][8];
		String n[] = new String[8];
		String Decision = null;
		int ContinueOrEnd = 0;
		for(int i = 0 ; i < 8 ; i++){
			n[i] = scan.next();
			char Substitution[] = n[i].toCharArray();
			for(int j = 0; j < 8 ;j++){
				N[i][j] = String.valueOf( Substitution[j]);
			}
		}
		int I = 0;
		int k = 0;
		for(I = 0 ; I < 8 ; I++){
			for(k = 0 ; k < 8 ; k++){
				if(N[I][k].equals("1")){
					ContinueOrEnd = 1;
					break;
				}
			}
			if(ContinueOrEnd == 1){
				break;
			}
		}
		if(k == 7){
			k-=1;
			++I;
			if(N[I][k].equals("1")){
				Decision = "D";
			}else{
				Decision = "B";
			}
		}else{
			++k;
			if(N[I][k].equals("1")){
				if(k == 7){
					k-=2;
					++I;
					if(N[I][k].equals("1")){
						Decision = "G";
					}else{
						Decision = "A";
					}
				}else{
					++k;
					if(N[I][k].equals("1")){
						Decision = "C";
					}else{
						k-=3;
						++I;
						if(N[I][k].equals("1")){
							Decision = "G";
						}else{
							++k;
							if(N[I][k].equals("1")){
								Decision = "A";
							}else{
								Decision = "E";
							}
						}
					}
				}
			}else{
				k-=2;
				++I;
				if(N[I][k].equals("1")){
					Decision = "D";
				}else{
					k+=2;
					if(N[I][k].equals("1")){
						Decision = "F";
					}else{
						Decision = "B";
					}
				}
			}
			System.out.println(Decision);
		}
	}
}