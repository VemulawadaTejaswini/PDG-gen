//8-C
import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[] count = new int[26];
    	
    	while(sc.hasNext()){
    		
    		 String moji = sc.next();
    	
	    	 for(int i = 0; i < moji.length(); ++i){
	    		 
	             if(Character.isLowerCase(moji.charAt(i))){
	                 
	            	 int num = moji.charAt(i) - 'a';
	            	 count[num]++;
	            	 
	             }else if(Character.isUpperCase(moji.charAt(i))){
	            	 
	            	 int num = moji.charAt(i) - 'A';
	            	 count[num]++;
	            	 
	             }
	         }
    	}
            
    	 for(int i = 0 ; i < count.length ; i++ ){
    		 
    		 //0-25 a-z が対応しているの。0=a 1=b 2=c
    		 //('a' + i)この部分が書き方
    		 //'a'は小文字のアルファベットに対応
    		 //もし'A'なら大文字のアルファベットがでてくる。
    		 char alpha = (char)('a' + i);
    		 
    		 System.out.println(alpha + " " + ":" + " " + count[i]);
    		
    	 }
    	
            

    }

	
}