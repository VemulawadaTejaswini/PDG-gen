import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	InputStream inputStream = System.in;
    	OutputStream outputStream = System.out;
    	Scanner sc = new Scanner(inputStream);
    	PrintWriter out = new PrintWriter(outputStream);
      	int N = Integer.parseInt(sc.next());
      	String S = sc.next();
      	int Wn[] = new int[N + 1];
      	int En[] = new int[N + 2];
      	Wn[0] = 0;
      	for(int i = 1; i <= N; i++){
        	if(S.charAt(i - 1) == 'W'){
              	Wn[i]++;
            }
            Wn[i] += Wn[i - 1];
        }
      	En[N + 1] = 0;
      	for(int i = N; 1 <= i; i--){
      		if(S.charAt(i - 1) == 'E'){
            	En[i]++;
            }
          En[i] += En[i + 1];
      	}
      	int min = Integer.MAX_VALUE;
      	for(int i = 1; i <= N; i++){
        	min = (int)Math.min(min, Wn[i - 1]+En[i + 1]);
        }
      	out.println(min);
    	out.close();
    }
}