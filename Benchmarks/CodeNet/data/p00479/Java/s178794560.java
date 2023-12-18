import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int i=0,length=0,dam=0;
		boolean first=true;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	if(first){
            		length=Integer.parseInt(line);
            		first=false;
            		line = br.readLine();
            		dam=Integer.parseInt(line);
            	}else{
            		String[] tokens=line.split(" ");
            		int a=Integer.parseInt(tokens[0]);
            		int b=Integer.parseInt(tokens[1]);
            		if(length%2==0){
            			a=length/2<a?length-a+1:a;
            			b=length/2<b?length-b+1:b;
            		}else{
            			if(length/2+1!=a){
            				a=length/2<a?length-a+1:a;
            			}
            			if(length/2+1!=b){
            				b=length/2<b?length-b+1:b;
            			}
            		}
            		System.out.println(Integer.min(a,b)%3==0?3:Integer.min(a,b)%3);

            		i++;
            		if(i==dam){
            			break;
            		}
            	}
            }
		}
	}

}