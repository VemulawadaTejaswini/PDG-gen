import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=3000;i++){
        	String items[]=reader.readLine().split(" ");
        	int num1=Integer.parseInt(items[0]);
        	int num2=Integer.parseInt(items[1]);
        	if(num1<num2){
            	sb.append(items[0] + " " + items[1]+ "\n");
        	}else{
            	sb.append(items[1] + " " + items[0]+ "\n");
        	}
            if(num1==0 && num2==0){
            	break;
            }
        }
        System.out.println(sb);
	}
}