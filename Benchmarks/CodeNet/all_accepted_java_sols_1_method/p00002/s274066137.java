import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null&&line.length()!=0) {
            	String[] str=line.split(" ");
            	int sum=Integer.parseInt(str[0])+Integer.parseInt(str[1]);
            	int i=0;
            	while(sum>0){
            		sum=sum/10;
            		i++;
            	}
            	System.out.println(i);
            }
         }
	}
}