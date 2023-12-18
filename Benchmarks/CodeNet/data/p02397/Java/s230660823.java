import java.util.Scanner;

class Main {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	while(in.hasNext()) {
    		int a = in.nextInt();
    		int b = in.nextInt();
    		if (a == b) {
    			if(a == 0) {
    				break;
    			}
    			sb.append(a).append(" ").append(b).append("\n");
    		} else if(a < b){
    			sb.append(a).append(" ").append(b).append("\n");
    		} else {
    			sb.append(b).append(" ").append(a).append("\n");
    		}
    	}
    	System.out.println(sb);
    }
}