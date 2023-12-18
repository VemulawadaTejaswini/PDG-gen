import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static String[] field = new String[3];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(true){
			field = new String[3];
			field[0]=cin.next();
			if(field[0].equals("0")){
				break;
			}
			field[1]=cin.next();
			field[2]=cin.next();
			for(int i = 0;i<3;i++){
				if(field[i].charAt(0)==field[i].charAt(1)
						&& field[i].charAt(2)==field[i].charAt(1)){
					if(field[i].charAt(0)!='+'){
						System.out.println(field[i].charAt(0));
						continue label;
					}
				}
				else if(field[0].charAt(i)==field[1].charAt(i)
						&& field[2].charAt(i)==field[1].charAt(i)){
					if(field[0].charAt(i)!='+'){
					System.out.println(field[0].charAt(i));
					continue label;
					}
				}
			}
			
			if(field[0].charAt(0)==field[1].charAt(1)
					&& field[1].charAt(1)==field[2].charAt(2)){
				if(field[0].charAt(0)!='+'){
				System.out.println(field[0].charAt(0));
				continue label;
				}
			}
			else if(field[0].charAt(2)==field[1].charAt(1)
					&& field[1].charAt(1)==field[2].charAt(0)){
				if(field[0].charAt(2)!='+'){
				System.out.println(field[0].charAt(2));
				continue label;
				}
			}
			System.out.println("NA");
		}
	}
}