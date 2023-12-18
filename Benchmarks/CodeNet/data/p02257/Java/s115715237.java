import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int number = Integer.parseInt(line);
        int[] nature = new int[number];
        
        for(int i=0;i<number;i++){
        	nature[i]=Integer.parseInt(sc.nextLine());
        }       
        
        int[] half = new int[number];        
        
        for(int i=0;i<number;i++){
            if(nature[i]%2==0){
            	half[i]=nature[i]/2;
            }else{
            	half[i]=(nature[i]/2)+1;
            }
        }
        
        int count=0;

        for(int i=0;i<number;i++){
        	int fig=1;
        	if(nature[i]==2){
        		fig=1;
        	}else{
        	
        	for(int j=half[i];j>1;j--){      		
        		if(nature[i]%j==0){
        			fig=0;
        		}
        	}	
        	}
        	
        	if(fig==1){
        		count++;
        	}         	
        }
        
        System.out.println(count);
        
    }   
}