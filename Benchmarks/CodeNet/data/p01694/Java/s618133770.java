import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        solve();
    }
	
    public static void solve() {
        Scanner sc = new Scanner(System.in);
 
        while (true) {
        	int num = sc.nextInt();
 
            if (num == 0) {
                break;
            }
            
            int count = 0;
            boolean isComp = false;
            String[] step = new String[num];
            for (int i = 0; i < num; i++) {
                step[i] = sc.next();   
            }
            
            for (int i = 0; i < num; i++) { 
            	if(isComp == true) {
            		i = i + 1;
            	}
                switch(step[i]) {
                	case "lu":
                		if(step[i+1] == "ru") {
                			count++;
                		}
                			isComp = true;
                			break;
            
                	case "ru":
                		if(step[i+1] == "lu") {
                			count++;
                		}
                			break;
                	case "ld":
                		if(step[i+1] == "rd") {
                			count++;
                		}
                			break;
                	case "rd":
                		if(step[i+1] == "ld") {
                			count++;
                		}
                			break;
                }
            }
            System.out.println(count);
        }
    }
}
