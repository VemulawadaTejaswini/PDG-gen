import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int q=sc.nextInt();
        String order[][] = new String[q][4];

        for( int i = 0; i < q; i++) {
        	order[i][0]= sc.next();
        	order[i][1]= sc.next();
        	order[i][2]= sc.next();
        	if("replace".equals(order[i][0])) {
            	order[i][3]= sc.next();
        	}
        }
        sc.close();
        for( int i = 0; i < q; i++) {
        	String command = order[i][0];
        	int start = Integer.parseInt(order[i][1]);
        	int end = Integer.parseInt(order[i][2]);
        	if ("replace".equals(command)) {
        		StringBuffer sb = new StringBuffer(str);
        		str = sb.replace(start, end+1, order[i][3]).toString();
        	} else if ("print".equals(command)) {
        		System.out.println(str.substring(start,end +1));
        	} else if ("reverse".equals(command)) {
        		StringBuffer sb = new StringBuffer(str.substring(start,end + 1));
        		String bef = str.substring(start,end+1);
        		String aft = sb.reverse().toString();
        		str = str.replace(bef, aft);
        	}
        }
    }
}

