import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
	    String str = input.readLine();
	    char[] kanrisya = str.toCharArray();
	    int[] kanri = new int[1001];
	    int[][] bunki = new int[1001][7];
	    int ans = 0;
	    for(int i = 1; i <= n; i++){
	    	if(kanrisya[i - 1] == 'J') kanri[i] = 1;
    		else if(kanrisya[i - 1] == 'O') kanri[i] = 2;
    		else if(kanrisya[i - 1] == 'I') kanri[i] = 3;
    		else kanri[i] = 0;
	    }
	    for(int i = 0; i <= n; i++){
	    	for(int j = 0; j < 7; j++){
	    		if(i == 0 && j == 0) bunki[i][j] = 1;
	    		else bunki[i][j] = 0;
	    	}
	    }
	    for(int i = 1; i <= n; i++){
	    	if(kanri[i] == 1){
	    		bunki[i][0] = bunki[i-1][0]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][6];
	    		bunki[i][3] = bunki[i-1][0]+bunki[i-1][1]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    		bunki[i][4] = bunki[i-1][0]+bunki[i-1][2]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    		bunki[i][6] = bunki[i-1][0]+bunki[i-1][1]+bunki[i-1][2]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    	}
	    	else if(kanri[i] == 2){
	    		bunki[i][1] = bunki[i-1][1]+bunki[i-1][3]+bunki[i-1][5]+bunki[i-1][6];
	    		bunki[i][3] = bunki[i-1][0]+bunki[i-1][1]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    		bunki[i][5] = bunki[i-1][1]+bunki[i-1][2]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    		bunki[i][6] = bunki[i-1][0]+bunki[i-1][1]+bunki[i-1][2]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    	}
	    	else{
	    		bunki[i][2] = bunki[i-1][2]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    		bunki[i][4] = bunki[i-1][0]+bunki[i-1][2]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    		bunki[i][5] = bunki[i-1][1]+bunki[i-1][2]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    		bunki[i][6] = bunki[i-1][0]+bunki[i-1][1]+bunki[i-1][2]+bunki[i-1][3]+bunki[i-1][4]+bunki[i-1][5]+bunki[i-1][6];
	    	}
	    	for(int k = 0; k < 7; k++){
    			bunki[i][k] = bunki[i][k] % 10007;
    		}
	    	if(i < 1000 && kanri[i + 1] == 0) break;
	    }
	    for(int i = 0; i < 7; i++){
    		ans += bunki[n][i];
    		ans = ans % 10007;
    	}
	    System.out.println(ans);
	    return;
	}
}