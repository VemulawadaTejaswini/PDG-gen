import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean[] arg = null;
		int length=0;
        int i=0;
        boolean first=true;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		length=Integer.parseInt(line);
            		arg=new boolean[length];
            		first=false;
            	}else{
            		String[] tokens = line.split(" ");
            		int max,mid,min;
            		int a= Integer.parseInt(tokens[0]);
            		int b = Integer.parseInt(tokens[1]);
            		int c = Integer.parseInt(tokens[2]);
            		max=Integer.max(Integer.max(a, b),Integer.max(c, b));
            		min=Integer.min(Integer.min(a, b),Integer.min(c, b));
            		if(max!=a&&min!=a){
            			mid=a;
            		}else if(max!=b&&min!=b){
            			mid=b;
            		}else if(max!=c&&min!=c){
            			mid=c;
                	}else{
                		mid=a;
                	}
            		arg[i]=max*max==min*min+mid*mid;
            		i++;
            		if(i==length){
            			break;
            		}
            	}
            }
            for(int j=0;j<i;j++){
            	System.out.println(arg[j]?"YES":"NO");
            }
        }
	}

}