import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			char[] str = scan.nextLine().toCharArray();
			for(int i = 0; i < str.length;i++){
				if(Character.isLowerCase(str[i])){
					System.out.print(Character.toUpperCase(str[i]));
				}else if(Character.isUpperCase(str[i])){
					System.out.print(Character.toLowerCase(str[i]));
				}else
					System.out.print(str[i]);
				System.out.println();
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}