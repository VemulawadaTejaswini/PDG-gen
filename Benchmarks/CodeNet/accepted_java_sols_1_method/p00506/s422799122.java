import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int length=0;
		int[] store;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	length=Integer.parseInt(line);
            	String[] str=br.readLine().split(" ");
            	if(length==2){
            		store=new int[2];
            		for(int i=0;i<str.length;i++){
            			store[i]=Integer.parseInt(str[i]);
            		}
            		for(int i=1;i<Integer.min(store[0],store[1])+1;i++){
            			if(store[0]%i==0 && store[1]%i==0){
            				System.out.println(i);
            			}
            		}
            	}else{
            		store=new int[3];
            		for(int i=0;i<str.length;i++){
            			store[i]=Integer.parseInt(str[i]);
            		}
            		int min=Integer.min(Integer.min(store[0],store[1]),Integer.min(store[2],store[1]));
            		for(int i=1;i<min+1;i++){
            			if(store[0]%i==0 && store[1]%i==0 && store[2]%i==0){
            				System.out.println(i);
            			}
            		}
            	}

            	break;
            }
		}
	}

}