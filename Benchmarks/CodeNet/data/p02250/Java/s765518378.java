import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String literal = sc.nextLine();
        int encount = Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<encount;i++){
        	String line = sc.nextLine();
        	if(line.indexOf(line)==-1){
        		System.out.println(0);
        	}else{
        		System.out.println(1);
        	}
        }
    }
}