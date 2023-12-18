import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        boolean[] arg = null;
        int length=0;
        int i=0;
        int state=0;
        int a_kun=0,b_kun=0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0")){
            		break;
            	}
                if(state==0){
                    length=Integer.parseInt(line);
                    arg=new boolean[length];
                    a_kun=0;
                    b_kun=0;
                    state=1;
                    i=0;
                }else{
                    String[] tokens = line.split(" ");
                    int a= Integer.parseInt(tokens[0]);
                    int b = Integer.parseInt(tokens[1]);
                    if(a==b){
                    	a_kun+=a;
                    	b_kun+=b;
                    }else if(a>b){
                    	a_kun+=(a+b);
                    }else{
                    	b_kun+=(a+b);
                    }
                    i++;
                    if(i==length){
                    	System.out.println(a_kun+" "+b_kun);
                        state=0;
                    }
                }
            }
        }
    }

}