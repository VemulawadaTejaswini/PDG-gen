import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int s=1;
	while(s!=0){
		int i=0;
		String str = input.readLine();
		int num = Integer.parseInt(str);
i++;
s=num;
		sb.append("Case"+ (i+1) + ":" +num +"\n");
		}
	System.out.println(sb);

}
}