//(クロ)# = 35, (シロ). = 46

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	char[][] X = new char[100][100];

	//左半分シロ
	for(int i = 0; i < 100; i++){
	    for(int j = 0; j < 50; j++){
		X[i][j] = '.';
	    }
	}
	//右半分クロ
	for(int i = 0; i < 100; i++){
	    for(int j = 50; j < 100; j++){
		X[i][j] = '#';
	    }
	}

	int A = scan.nextInt();
	int B = scan.nextInt();
	
	for(int i = 1; i < 100; i+=2){
	    for(int j = 51; j < 100; j+=2){
		if(A > 1){
		    X[i][j] = '.';
		    A--;
		}else{
		    break;
		}
	    }
	    if(A > 1){
	    }else{
		break;
	    }
	}

	for(int i = 1; i < 100; i+=2){
	    for(int j = 1; j < 49; j+=2){
		if(B > 1){
		    X[i][j] = '#';
		    B--;
		}else{
		    break;
		}
	    }
	    if(B > 1){
	    }else{
		break;
	    }
	}
	System.out.println(100 + " " + 100);
	for(int i = 0; i < 100; i++){
	    for(int j = 0; j < 100; j++){
		System.out.print(X[i][j]);
	    }
	    System.out.println();
	}
    }
}
