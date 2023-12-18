import java.util.Scanner;
import java.math.BigDecimal;
public class Main {

  
	public static void main(String[] args) {
      
      	Main main = new Main();
      	main.run();
    }
  
  	void run() {
    	Scanner sc = new Scanner(System.in);
    	int cnt = sc.nextInt(); 
      	sc.nextLine();
      	String []num = sc.nextLine().split(" ");

      	double  ans = 1;
		double  limit = Math.pow(10, 18);
      	for (int i = 0; i < num.length; i++) {
          	double v = Integer.parseInt(num[i]);
          	if (v == 0) {
              ans = 0;
              break;
            }
        	else if (ans * v > limit) {
              ans = -1;
            }
          	else {
              ans *= v;
            }
        }
                
      	String str = BigDecimal.valueOf(ans).toPlainString();
      	if (str.indexOf(".0") >= 0) {
	      	str = str.substring(0, str.length() - 2);
        }
		System.out.println(str);
    
    }      
  
}