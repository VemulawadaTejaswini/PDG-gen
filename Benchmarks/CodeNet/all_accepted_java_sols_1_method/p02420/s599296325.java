import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
        	String str = sc.next();
        	if(str.equals("-")){
        		break;
        	}
        	int x = sc.nextInt();
        	StringBuilder sb = new StringBuilder();
        	sb.append(str);
        	for(int i=0; i<x; i++){
        		String t = sb.toString();
        		int y = sc.nextInt();
            	String tmp = t.substring(0, y);
            	sb.delete(0, y);
            	sb.append(tmp);
        	}
        	System.out.println(new String(sb));
        }
    }
}

