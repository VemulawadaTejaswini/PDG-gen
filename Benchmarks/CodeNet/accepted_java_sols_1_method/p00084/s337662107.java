import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	String str = scan.nextLine();
        	str = str.replace(',', '.');
        	str = str.replace('.',' ');
        	String[] nstr = str.split(" ");
        	str = "";
        	for(int i = 0;i < nstr.length;i++){
        		int l = nstr[i].length();
        		if(l > 2 && l < 7){
        			str += ((str.equals("")?"":" ") + nstr[i]);
        		}
        	}
        	System.out.println(str);
        }
    }
}