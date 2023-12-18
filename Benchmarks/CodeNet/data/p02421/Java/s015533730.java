import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
        int tp=0,hp=0;
    	int n=sc.nextInt();
    	for(;n>0;n--){
    		char[]taro=sc.next().toCharArray();
    		char[]hana=sc.next().toCharArray();	
    	    hp++;tp++;
    		for(int i=0;i<taro.length;i++){
    		
    		if((int)taro[i]<(int)hana[i]){
    			hp+=2;tp--;break;
    		}
    		else if((int)hana[i]<(int)taro[i]){
    			tp+=2;hp--;break;
    		}
    		
    	}
    	}
    System.out.println(tp+" "+hp);    
    }
    }