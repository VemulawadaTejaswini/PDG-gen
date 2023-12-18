import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,n=0,m=0;
            int[][] card=null;
            int[] mat=null;
            while ((line = br.readLine()) != null) {
            	if(line.equals("-1 -1 -1"))break;
            	String[] str=line.split(" ");
            	int a=Integer.parseInt(str[0]);
            	int b=Integer.parseInt(str[1]);
            	int c=Integer.parseInt(str[2]);
            	if(a==-1||b==-1){
            		System.out.println("F");
            	}else if(a+b>=80){
            		System.out.println("A");
            	}else if(a+b>=65){
            		System.out.println("B");
            	}else if(a+b>=50){
            		System.out.println("C");
            	}else if(a+b>=30){
            		if(c>=50){
            			System.out.println("C");
            		}else{
            			System.out.println("D");
            		}
            	}else{
            		System.out.println("F");
            	}
            }
        }
    }

}