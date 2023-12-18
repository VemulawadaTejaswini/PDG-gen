import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,n=0;
            int[][] card=new int[12][10];
            while ((line = br.readLine()) != null) {
            	if(first){
            		n=Integer.parseInt(line);
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		int a=Integer.parseInt(str[0]);
            		int b=Integer.parseInt(str[1]);
            		int c=Integer.parseInt(str[2]);
            		int d=Integer.parseInt(str[3]);
            		card[(a-1)*3+b-1][c-1]+=d;
            		i++;
            		if(i==n){
            			for(int j=0;j<12;j++){
            				for(int l=0;l<10;l++){
            					System.out.print(" "+card[j][l]);
            				}
            				System.out.println("");
            				if((j+1)%3==0&&j!=11){
            					System.out.println("####################");
            				}
            			}
            			break;
            		}
                	
            	}
            }
        }
    }

}