import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
      	char[] S = input.next().toCharArray();
      	// for condition_1
      	long r = 0;
      	long g = 0;
      	long b = 0;
      	for (int i = 0; i < N; i++) {
        	if (S[i] == 'R') r++;
          	if (S[i] == 'G') g++;
          	if (S[i] == 'B') b++;
        }
      
      	// for condition_2
      	long result = r * g * b;
      	for (int i = 0; i < N; i++) {
        	for (int j = 1; j < N; j++) {
              if (i - j >= 0 && i + j < N) {
                if(S[i] != S[i-j] && S[i] != S[i+j] && S[i-j] != S[i+j]){
                  result--;
                }
              }
            }
        }
 		System.out.println(result);
    }
}