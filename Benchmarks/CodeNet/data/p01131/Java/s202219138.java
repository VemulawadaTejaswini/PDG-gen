import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String [][] letters = {{" "},{" ",".",",","!","?"},{"c","a","b"},{"f","d","e"},{"i","g","h"},{"l","j","k"},{"o","m","n"},{"s","p","q","r"},{"v","t","u"},{"z","w","x","y"},{" ","A","B","C","D","E","F","G","H","I"}};
    	int [] length = {0,5,3,3,3,3,3,4,3,4};
    	
    	int n = sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		String str = sc.next();
    		String [] s = str.split("0");
    		String ans = "";
    		for(String ss:s) {
    			int l = ss.length();
    			if(l>0) {
    				int x = ss.charAt(0)-'0';
        			int y = length[x];
        			ans += letters[x][l%y];
    			}
    		}
    		System.out.println(ans);
        }
    }
