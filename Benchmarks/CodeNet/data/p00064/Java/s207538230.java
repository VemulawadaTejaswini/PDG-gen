import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(scan.hasNext()){
        	char[] ch = scan.next().toCharArray();
        	String ns = "";
        	for(int i = 0;i < ch.length;i++){
        		if(Character.isDigit(ch[i])){
        			ns += ch[i];
        			if(i == ch.length-1){
        				sum += Integer.parseInt(ns);
        			}
        			continue;
        		}
        		if(!ns.equals("")){
        			sum += Integer.parseInt(ns);
        			ns = "";
        		}
        	}
        }
        System.out.println(sum);
    }
}