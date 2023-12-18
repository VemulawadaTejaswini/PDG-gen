import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	int a=Integer.parseInt(str[0]);
            	int b=Integer.parseInt(str[2]);
            	if(str[1].equals("?"))break;
            	else if(str[1].equals("+"))System.out.println(a+b);
            	else if(str[1].equals("-"))System.out.println(a-b);
            	else if(str[1].equals("/"))System.out.println(a/b);
            	else if(str[1].equals("*"))System.out.println(a*b);
            	
            }
        }
    }
}