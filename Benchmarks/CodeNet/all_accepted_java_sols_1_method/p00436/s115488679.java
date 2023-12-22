import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,length=0;
            boolean first=true;
            int[] card=null;
            
            while ((line = br.readLine()) != null) {
	            if(first){
	            	length=Integer.parseInt(line)*2;
	            	card=new int[length+1];
	            	for(int k=1;k<card.length;k++){
	            		card[k]=k;
	            	}
	            	i=Integer.parseInt(br.readLine());
	            	first=false;
	            }else{
	            	int move=Integer.parseInt(line);
	            	if(move==0){
	            		int[] n=new int[length+1];
	            		for(int k=1;k<length+1;k++){
	            			if(k%2==1){
	            				n[k]=card[k/2+1];
	            			}else{
	            				n[k]=card[length/2+k/2];
	            			}
	            		}
	            		card=n.clone();
	            	}else{
	            		int[] n=new int[length+1];
	            		for(int k=move+1;k<length+1;k++){
	            			n[k-move]=card[k];
	            		}
	            		for(int k=1;k<move+1;k++){
	            			n[k+length-move]=card[k];
	            		}
	            		card=n.clone();
	            	}
	            	i--;
	            	if(i==0){
	            		for(int k=1;k<card.length;k++){
	            			System.out.println(card[k]);
	            		}
	            		break;
	            	}
	            }
            }
        }
    }
}