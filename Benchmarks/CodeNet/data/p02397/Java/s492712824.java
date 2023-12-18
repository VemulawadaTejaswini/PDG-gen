import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        for(int i=0;;i++){
        	String items[]=reader.readLine().split(" ");
        	int num1=Integer.parseInt(items[0]);
        	int num2=Integer.parseInt(items[1]);
            if(num1==0 && num2==0){
            	break;
            }
        	if(num1<num2){
            	sb.append(num1 + " " + num2).append("\n");
        	}else{
            	sb.append(num2 + " " + num1).append("\n");;
        	}
        }
        System.out.println(sb);
	}
}