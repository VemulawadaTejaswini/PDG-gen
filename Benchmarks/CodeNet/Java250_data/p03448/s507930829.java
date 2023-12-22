import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	InputStream input = System.in;
      	OutputStream output = System.out;
      	Scanner sc = new Scanner(input);
      	PrintWriter out = new PrintWriter(output);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int X = sc.nextInt();
      	int count = 0;
      	for(int i = 0; i <= A; i++){
        	for(int j = 0; j <= B; j++){
            	for(int l = 0; l <= C; l++){
                	if((500 * i) + (100 * j) + (50 * l) == X){
                    	count++;
                    }
                }
            }
        }
      	out.println(count);
      	out.close();
    }
}