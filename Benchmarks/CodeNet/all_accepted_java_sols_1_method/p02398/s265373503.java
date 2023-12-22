import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
    	String items[]=reader.readLine().split(" ");
    	int a=Integer.parseInt(items[0]);
    	int b=Integer.parseInt(items[1]);
    	int c=Integer.parseInt(items[2]);
    	int counter=0;
        for(int i=a;i<=b;i++){
        	if(c%i==0){
        		counter++;
        	}
        }
        System.out.println(counter);
	}
}