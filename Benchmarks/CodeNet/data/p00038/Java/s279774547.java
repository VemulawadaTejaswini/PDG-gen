import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
        	String[] pairstr = input.nextLine().split(",");
        	int[] pairs = new int[pairstr.length];
        	for(int i = 0 ; i < pairstr.length ; i++){
        		pairs[i] = Integer.parseInt(pairstr[i]);
        	}
        	/*for(int i = 0 ; i < pairs.length ; i++){
        		if(pairs[i]==("A")){
        			pairs[i] = "1";
        		}else if(pairs[i]==("K")){
        			pairs[i] = "13";
        		}else if(pairs[i]==("Q")){
        			pairs[i] = "12";
        		}else if(pairs[i]==("J")){
        			pairs[i] = "11";
        		}
        	}*/
        	Arrays.sort(pairs);
        	System.out.println(order(pairs));
        }
    }

    public static String order(int[] pairs){
    	if(pairs[0]==pairs[3] || pairs[1]==pairs[4])return "four card";
    	if((pairs[0]==pairs[1] && pairs[2]==pairs[4]) || (pairs[0]==pairs[2] && pairs[3]==pairs[4]))return "full house";
    	if(pairs[0]+1 == pairs[1] && pairs[1]+1 == pairs[2] && pairs[2]+1 == pairs[3] && pairs[3]+1 == pairs[4])return "straight";
    	if(pairs[0] == 1 && pairs[1] == 10 && pairs[2] == 11 && pairs[3] == 12 && pairs[4] == 13)return "straight";
    	if(pairs[0]==pairs[2] || pairs[1]==pairs[3] || pairs[2]==pairs[4])return "three card";
    	if((pairs[0]==pairs[1] && pairs[2]==pairs[3]) || (pairs[0]==pairs[1] && pairs[3]==pairs[4]) || (pairs[1]==pairs[2] && pairs[3]==pairs[4]))return "two pair";
    	if(pairs[0]==pairs[1] || pairs[1]==pairs[2] || pairs[2]==pairs[3] || pairs[3]==pairs[4])return "one pair";
    	return "null";
    }
}