import java.util.Arrays; 
import java.util.Scanner; 
public class Main { public static void main(String[] args) { 
Scanner keyboard = new Scanner(System.in); 

int N = keyboard.nextInt(); 

int sumW = 0;
int[] s1 = new int[N];

for(int i =0; i<N; i++){
sumW += keyboard.nextInt(); 
s1[i] = sumW;
}

int[] z = new int[N-1];

int ans  = 1000000000;
for(int j =0; j<N-1; j++){
ans = Math.min(Math.abs((sumW - s1[j]) - s1[j]), ans);
}

		System.out.println(ans);
		keyboard.close();
	 	}
 } 
