import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	char[] str = scan.next().toCharArray();
        	int n = scan.nextInt();
        	int count = 0;
        	int sc = 0;
        	boolean sw = false;
        	for(int i = 0;i < n;i++){
        		char[] ring = scan.next().toCharArray();
        		sw = false;
        		for(int j = 0;j < 10;j++){
        			sc = 0;
        			for(int k = 0;k < str.length;k++){
        				if(str[k] == ring[(j+k)%10]){
        					sc++;
        				}
        				if(sc == str.length){
        					count++;
        					sw = true;
        					break;
        				}
        			}
        			if(sw){
        				break;
        			}
        		}
        	}
        	System.out.println(count);
        }
	}
}