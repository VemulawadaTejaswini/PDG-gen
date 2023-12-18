import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
	    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
	    int n = sc.nextInt();
	    String str = input.readLine();
	    char[] kanrisya = str.toCharArray();
	    int[] kanri = new int[n + 1];
	    int[][] bunki = new int[n + 1][7];
	    int ans = 0;
	    for(int i = 0; i <= n; i++){
	    	if(i == 0) kanri[i] = 1;
	    	else {
	    		if(kanrisya[i - 1] == 'J') kanri[i] = 1;
	    		else if(kanrisya[i - 1] == 'O') kanri[i] = 2;
	    		else if(kanrisya[i - 1] == 'I') kanri[i] = 3;
	    		else ;
	    	}
	    }
	    for(int i = 0; i <= n; i++){
	    	for(int j = 0; j < 7; j++){
	    		if(i == 0 && j == 0) bunki[i][j] = 1;
	    		else bunki[i][j] = 0;
	    	}
	    }
	    for(int i = 1; i <= n; i++){
	    	for(int j = 0; j < 7; j++){
	    		switch(j % 7){
	    		case 0:
	    			if(bunki[i - 1][j] > 0){
	    				if(kanri[i] == 1){
	    					bunki[i][0] += bunki[i - 1][j]; bunki[i][3] += bunki[i - 1][j];
	    					bunki[i][4] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else if(kanri[i] == 2){
	    					bunki[i][3] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else {
	    					bunki[i][4] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    			}
	    			break;
	    		case 1:
	    			if(bunki[i - 1][j] > 0){
	    				if(kanri[i] == 1){
	    					bunki[i][3] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else if(kanri[i] == 2){
	    					bunki[i][1] += bunki[i - 1][j]; bunki[i][3] += bunki[i - 1][j];
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else {
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    			}
	    			break;
	    		case 2:
	    			if(bunki[i - 1][j] > 0){
	    				if(kanri[i] == 1){
	    					bunki[i][4] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else if(kanri[i] == 2){
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else {
	    					bunki[i][2] += bunki[i - 1][j]; bunki[i][4] += bunki[i - 1][j];
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    			}
	    			break;
	    		case 3:
	    			if(bunki[i - 1][j] > 0){
	    				if(kanri[i] == 1){
	    					bunki[i][0] += bunki[i - 1][j]; bunki[i][3] += bunki[i - 1][j];
	    					bunki[i][4] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else if(kanri[i] == 2){
	    					bunki[i][1] += bunki[i - 1][j]; bunki[i][3] += bunki[i - 1][j];
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else {
	    					bunki[i][4] += bunki[i - 1][j]; bunki[i][5] += bunki[i - 1][j];
	    					bunki[i][6] += bunki[i - 1][j];
	    				}
	    			}
	    			break;
	    		case 4:
	    			if(bunki[i - 1][j] > 0){
	    				if(kanri[i] == 1){
	    					bunki[i][0] += bunki[i - 1][j]; bunki[i][3] += bunki[i - 1][j];
	    					bunki[i][4] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else if(kanri[i] == 2){
	    					bunki[i][3] += bunki[i - 1][j]; bunki[i][5] += bunki[i - 1][j];
	    					bunki[i][6] += bunki[i - 1][j]; 
	    				}
	    				else {
	    					bunki[i][2] += bunki[i - 1][j]; bunki[i][4] += bunki[i - 1][j];
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    			}
	    			break;
	    		case 5:
	    			if(bunki[i - 1][j] > 0){
	    				if(kanri[i] == 1){
	    					bunki[i][3] += bunki[i - 1][j]; bunki[i][4] += bunki[i - 1][j];
	    					bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else if(kanri[i] == 2){
	    					bunki[i][1] += bunki[i - 1][j]; bunki[i][3] += bunki[i - 1][j];
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j]; 
	    				}
	    				else {
	    					bunki[i][2] += bunki[i - 1][j]; bunki[i][4] += bunki[i - 1][j];
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    			}
	    			break;
	    		case 6:
	    			if(bunki[i - 1][j] > 0){
	    				if(kanri[i] == 1){
	    					bunki[i][0] += bunki[i - 1][j]; bunki[i][3] += bunki[i - 1][j];
	    					bunki[i][4] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    				else if(kanri[i] == 2){
	    					bunki[i][1] += bunki[i - 1][j]; bunki[i][3] += bunki[i - 1][j];
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j]; 
	    				}
	    				else {
	    					bunki[i][2] += bunki[i - 1][j]; bunki[i][4] += bunki[i - 1][j];
	    					bunki[i][5] += bunki[i - 1][j]; bunki[i][6] += bunki[i - 1][j];
	    				}
	    			}
	    			break;
	    		}
	    		for(int k = 0; k < 7; k++){
	    			bunki[i][k] %= 10007;
	    		}
	    	}
	    }
	    for(int i = 0; i < 7; i++){
    		ans += bunki[n][i];
    		ans %= 10007;
    	}
	    System.out.println(ans);
	}
}