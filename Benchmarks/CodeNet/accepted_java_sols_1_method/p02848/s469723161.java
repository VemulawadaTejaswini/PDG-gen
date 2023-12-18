import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	String str = sc.next();
        StringBuilder strn = new StringBuilder(str);
          	
      	for(int i=0;i<str.length();i++){
            int temp = (int)str.charAt(i) + N;
            String temp_char = "";
            if(temp <= 90)
        	    temp_char += (char)temp;
            else 
                temp_char += (char)(temp - 26);
            
            strn.replace(i, i + 1, temp_char);
        }
      	System.out.println(strn);
		
    }
	
}
