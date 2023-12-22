import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 文字列の入力
			String str = sc.next();
			String[] strArray = str.split("");

			int end2 = strArray.length -2;
			if(strArray[0].equals("A")){
			}else{
			    System.out.println("WA");
	    	    return;
			}

			int check = 0;
			for (int i = 2; i <= end2; i++) {
				if(strArray[i].equals("C")){
				    check = i;
				}
			}
			if(check  == 0){
				System.out.println("WA");
    	    	return;
			}
			for (int i = 1; i < strArray.length; i++) {
				if((i != 0)&&(i != check)){
					String temp = strArray[i].toString().toLowerCase();
					if(strArray[i].equals(temp)){
					}else{
						System.out.println("WA");
		    	    	return;
					}
				}
			}
		    System.out.println("AC");
    	    return;
			

		}
}
