import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 文字列の入力
			String str = sc.next();
			String[] strArray = str.split("");

			if(strArray[0].equals(strArray[1])){
				if(strArray[1].equals(strArray[2])){
					if(strArray[2].equals(strArray[3])){
					System.out.println("No");
					return;
					}
				}
			}

			
			if(strArray[0].equals(strArray[1])){
				if(strArray[2].equals(strArray[3])){
				    System.out.println("Yes");
		    	    return;
				}
			}else{
				if(strArray[0].equals(strArray[2])){
					if(strArray[1].equals(strArray[3])){
					    System.out.println("Yes");
			    	    return;
					}
				}else{
					if(strArray[0].equals(strArray[3])){
						if(strArray[1].equals(strArray[2])){
						    System.out.println("Yes");
				    	    return;
						}
					}						
				}
			}

			System.out.println("No");
    	    return;
			

		}
}
