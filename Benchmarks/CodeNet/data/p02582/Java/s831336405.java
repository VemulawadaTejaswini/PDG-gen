import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      	char[] work = new char[text.length()];
      	int count = 0;
      	int max = 0;
        for(int i = 0; i < line.length; i++){
			if(line.charAt(i) == 's'){
            	count++;
            }else{
				count = 0;
            }
       		if(count > max){
				count = max;
            }
    	}
      	System.out.println(max);
    }
}
