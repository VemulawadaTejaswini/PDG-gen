import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	
      	String str = sc.next();
      	String[] rs = new String[]{str.substring(0, 1), str.substring(1, 2), str.substring(2, 3)}; 
      	int count = 0;
      
      	if(rs[0].equals("R")) {
          	count++;
        }
      
        for(int i = 1; i <= rs.length - 1; i++) {
            if(rs[i].equals("R") && rs[i - 1].equals("R")) {
                count++;                
            }
            if(rs[i].equals("R") && rs[i - 1].equals("S")) {
                count = 1;
            }
         }
      
      	System.out.println(count);
      	sc.close();
    }
}