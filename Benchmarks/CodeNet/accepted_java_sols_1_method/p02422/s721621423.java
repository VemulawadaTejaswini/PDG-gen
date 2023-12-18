import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        int count = sc.nextInt();

        for(int i=0; i < count; i++){
        	String op = sc.next();
        	int a = sc.nextInt();
        	int b = sc.nextInt() + 1;

        	if(op.equals("print")){
         		System.out.println(sb.substring(a, b));
        	}
        	if(op.equals("replace")){
        		String tmp = sc.next();
        		sb.replace(a, b, tmp);
        	}
        	if(op.equals("reverse")){
        		StringBuilder nwsb = new StringBuilder(sb.substring(a, b));
        		nwsb.reverse();
        		String nstr = nwsb.toString();
        		sb.replace(a, b, nstr);
        	}
        }
    }
}

