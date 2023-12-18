import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[] strs = input.nextLine().split(" ");
        int plusindex = 0;
        for(int i = 0 ; i < strs.length ; i++){
        	if(strs[i].length() == 3 || strs[i].length() == 4){
        		for(int j = 1 ; j <= 25 ; j++){
        			StringBuilder sb = new StringBuilder();
        			for(int k = 0 ; k < strs[i].length(); k++){
        				int chai = strs[i].charAt(k)+j;
        				if(chai > 122){
        					sb.append((char)(chai-26));
        				}else{
        					sb.append((char)(chai));
        				}
        			}
        			String sbt = sb.toString();
        			if(sbt.equals("the") || sbt.equals("this") || sbt.equals("that")){
        				plusindex = j;
        				break;
        			}
        			if(plusindex != 0)break;
        		}
        	}
        	if(plusindex != 0)break;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < strs.length ; i++){
			for(int k = 0 ; k < strs[i].length(); k++){
				if(i == strs.length-1 && k == strs[i].length()-1){
					sb.append(".");
				}else{
					int chai = strs[i].charAt(k)+plusindex;
					if(chai > 122){
						sb.append((char)(chai-26));
					}else{
						sb.append((char)(chai));
					}
				}
			}
			if(i != strs.length-1)sb.append(" ");
        }
        System.out.println(sb);
    }    
}