import java.util.Scanner;


class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	String str;
	  	String con[] =  new String[1200];
	  	String com = "\n";
		int count = 0;
  		boolean space = false;
  		boolean end = false;
		
  		//初期化
  		for(int i = 0; i < 1200 ;i ++) {
	  		con[i] = "";
		}
  		
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
			
			if( con[count].equals(com) ){
				end = true;
			}
			
			for(int i = 0; i < count ;i ++) {
				if(i == count){
					System.out.println(con[i]);
				}else if(space && i == 0){
					System.out.print(" " + con[i]);
				}else{
					System.out.print(con[i]);
				}
			}
			
			space = true;
		}while( str != null || end );
		scanner.close();
  }
}
