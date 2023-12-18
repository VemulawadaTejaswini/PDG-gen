import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0;
            double sum=0;
            while ((line = br.readLine()) != null) {
            	n=Integer.parseInt(line);
            	sum=0;
            	double sum2=0;
            	double sum3=0;
            	String[] str1=br.readLine().split(" ");
            	String[] str2=br.readLine().split(" ");
            	double max=0;
            	for(int i=0;i<n;i++){
            		sum+=Math.abs(Integer.parseInt(str1[i])-Integer.parseInt(str2[i]));
            		sum2+=Math.pow(Integer.parseInt(str1[i])-Integer.parseInt(str2[i]), 2);
            		sum3+=Math.pow(Math.abs(Integer.parseInt(str1[i])-Integer.parseInt(str2[i])), 3);
            		if(max<Math.abs(Integer.parseInt(str1[i])-Integer.parseInt(str2[i]))){
            			max=Math.abs(Integer.parseInt(str1[i])-Integer.parseInt(str2[i]));
            		}
            	}
            	System.out.println(sum);
            	System.out.println(Math.sqrt(sum2));
            	System.out.println(Math.cbrt(sum3));
            	System.out.println(max);
            	break;
            }
        }
    }

}