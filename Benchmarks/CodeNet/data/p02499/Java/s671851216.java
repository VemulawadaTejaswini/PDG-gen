import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int[] counter = new int[26];
    	while(input.hasNext()){
    		String n = input.next().toLowerCase();
    		for(int i = 0 ; i < n.length(); i++){
    			char c = n.charAt(i);
    			if(97 <= c && c <= 122)counter[n.charAt(i)-97]++;
    		}
    	}
    	for(int i = 0 ; i < counter.length ; i++){
    		System.out.println((char)(i+97)+" : "+counter[i]);
    	}
    }
}