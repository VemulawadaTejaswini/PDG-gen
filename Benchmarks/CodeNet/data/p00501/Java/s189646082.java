import java.util.*;
     
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String str1 = sc.next();
    	String[] str2 = new String[N]; 
    	String sign;
    	int answer = 0,com = 0,space = 0;
    	
    	for(int i = 0;i < N;i++){
    		str2[i] = sc.next();
    	}
    	
    	for(int i = 0;i < N;i++){
    		sign = str2[i];
    		for(int j = 0;j <sign.length();j++){	//１文字目
    			if(str1.charAt(0) == sign.charAt(j)){
    				for(int k = j + 1;k < sign.length();k++){	//２文字目
    					space = k - j;
    					int count = 2,p = 1;
    					for(int s = k + space;s < sign.length();s += space){
    						if(str1.charAt(p) == sign.charAt(s)){
    							count++;
    						}else{
    							break;
    						}
    						p++;
    					}
    					if(count == str1.length()){
    						answer++;
    						break;
    					}
    				}
    			}else{
    				continue;
    			}
    		}
    	}
    	System.out.println(answer);
    	
    }
}