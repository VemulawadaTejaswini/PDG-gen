import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
       // System.out.println("0".compareTo("1"));
		ArrayDeque<String> queue1 = new ArrayDeque<String>();
		ArrayDeque<Integer> queue2 = new ArrayDeque<Integer>();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0,tam=0,i=0;
            boolean first=true;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	if(first){
            		n=Integer.parseInt(str[0]);
            		tam=Integer.parseInt(str[1]);
            		first=false;
            	}else{
            		queue1.add(str[0]);
            		queue2.add(Integer.parseInt(str[1]));
            		i++;
            		if(i==n){
            			break;
            		}
            	}           	
            }
            int store=0;
            while(!queue1.isEmpty()){
            	String str="";
            	while(true){
            		int a=queue2.poll();
            		str=queue1.poll();
            		if(a<=tam){
            			store+=a;
            			break;
            		}else{
            			store+=tam;
            			queue1.add(str);
            			queue2.add(a-tam);
            		}
            	}
            	System.out.println(str+" "+store);
            }
        }
	}


}