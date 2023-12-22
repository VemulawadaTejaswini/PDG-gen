import java.util.*;

public class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
            String buf = in.nextLine();
            if(buf.equals("0 0")){
            	break;
			}
            String[] num = buf.split(" ");
            if(Integer.parseInt(num[0]) < Integer.parseInt(num[1])){
            	System.out.println(num[0]+" "+num[1]);
            }else{
            	System.out.println(num[1]+" "+num[0]);
            }
        }
	}
}