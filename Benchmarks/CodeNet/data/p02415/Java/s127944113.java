import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	String str;
	  	String con[] =  new String[1200];
	  	String com = ".";
		int count;
  		int breakout = 0;
		
		do {
			str = scanner.next();
			count = str.length();
			
			for(int i = 0; i < count ;i ++) {
			    if( Character.isUpperCase( str.charAt( i ) ) ) {
		  			con[i] = str.substring(i,i + 1);
		  			con[i] = con[i].toLowerCase();
				}
		        else {
		  			con[i] = str.substring(i,i + 1);
		  			con[i] = con[i].toUpperCase();
				}
			}
			
			for(int i = 0; i < count ;i ++) {
				if(i == count){
					System.out.println(con[i]);
				}else if(breakout > 0 && i == 0){
					System.out.print(" " + con[i]);
				}else{
					System.out.print(con[i]);
				}
			}
			
			breakout ++;
		}while(count != 0 || str != null || con[count].equals(com) );
		scanner.close();
  }
}
