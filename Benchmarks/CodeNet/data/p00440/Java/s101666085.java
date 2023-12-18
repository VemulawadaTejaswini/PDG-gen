import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0,num=0;
        boolean[] card=null;
        int[][] result=null;
        boolean first=true;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		String[] str=line.split(" ");
            		if(line.equals("0 0"))break;
            		num=Integer.parseInt(str[1]);
            		card=new boolean[Integer.parseInt(str[0])+1];
            		i=0;
            		first=false;
            	}else{
            		card[Integer.parseInt(line)]=true;
            		i++;
            		if(i==num){
            			int max=0,count=0;
            			if(card[0]){
            				for(int j=1;j<card.length;j++){
            					if(card[j])continue;
            					card[j]=true;
	            				for(int k=1;k<card.length;k++){
	            					if(card[k]){
	            						count++;
	            					}else{
	            						count=0;
	            					}
	            					if(count>max){
	            						max=count;
	            					}
	            				}
	            				card[j]=false;
            				}
            			}else{
            				for(int k=1;k<card.length;k++){
            					if(card[k]){
            						count++;
            					}else{
            						count=0;
            					}
            					if(count>max){
            						max=count;
            					}
            				}
            			}
            			first=true;
            			System.out.println(max);
            		}

            	}
            }

        }
	}


}