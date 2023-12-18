import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        String x=null;
        String str = "abcdefghijklmnopqrstuvwxyz";
        String[] str2 = str.split("");
        	while(sc.hasNext()){
            	x = sc.nextLine();
            	x = x.toLowerCase();
        		String[] c = x.split("");
        		
        		for(int i=0;i<c.length;i++){
            		for(int j=0;j<str2.length;j++){
                    	if(str2[j].equals(c[i])){
                    		count[j]++;
                		}
           			}
        		}
        	}    
        for(int i=0;i<str2.length;i++){
                System.out.println(str2[i]+" : "+count[i]);
        }
    }
}
