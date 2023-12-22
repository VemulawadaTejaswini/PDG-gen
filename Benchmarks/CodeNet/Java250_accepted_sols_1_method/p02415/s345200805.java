import java.util.Scanner;


class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	String str = scanner.nextLine();			//入力
	  	String con[] =  new String[1200];
		int count = 0;
		
  		//初期化
  		for(int i = 0; i < 1200 ;i ++) {
	  		con[i] = "";
		}
			count = str.length();		//文字数取得
			
			//大文字小文字変換
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
			
			//出力
			for(int i = 0; i < count ;i ++) {
				if(i == count - 1){
					System.out.println(con[i]);
				}else{
					System.out.print(con[i]);
				}
			}
		scanner.close();
  }
}
