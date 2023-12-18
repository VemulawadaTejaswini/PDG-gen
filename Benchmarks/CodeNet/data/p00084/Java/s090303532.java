import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(sc.hasNext()){
			str = sc.nextLine();
			str = str.replace(',', ' ');
			str = str.replace('.', ' ');	
			String[] str2 = str.split(" ");
			for(int i = 0 ; i < str2.length; i ++){
				if(str.length()<3 || str.length()>6){
					continue;
				}
				else
					System.out.print(str2[i]);
				if(sc.hasNext())
					System.out.print(" ");
				else
					System.out.println("");		
			}
		}
	}
}