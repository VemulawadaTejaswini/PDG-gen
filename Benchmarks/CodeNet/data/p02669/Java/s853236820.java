package practice02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int T = 0;
        int piece = 0;
        int sum = 0;
        int sc[] = new int[5];

        Scanner scan = new Scanner(System.in);
        T = scan.nextInt();

        for(int i = 0; i < T; i++){
        	sc[0] = scan.nextInt();
        	sc[1] = scan.nextInt();
        	sc[2] = scan.nextInt();
        	sc[3] = scan.nextInt();
        	sc[4] = scan.nextInt();

        	sum = sum++;
        	piece = sc[4];

        	if(sc[0] > sum * 5){
            	sum = sum * 5;
            	piece = piece + sc[3];
        	}
        	else if(sc[0] > sum * 3){
            	sum = sum * 3;
            	piece = piece + sc[2];
        	}
        	else if(sc[0] > sum * 2){
            	sum = sum * 2;
            	piece = piece + sc[1];
        	}
        	else if(sc[0] > sum){
            	for(int j = sum; j < sc[0]; j++){
                	sum = sum++;
                	piece = piece + sc[4];
            	}
        	}
        	else{
            	for(int k = sum; k < sc[0]; k++){
                	sum = sum--;
                	piece = piece + sc[4];
            	}
        	}
        	System.out.println(piece);
        }
    }
}