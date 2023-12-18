import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int room = scan.nextInt();
			if(room == 0){
				break;
			}
			int i = 1;
			String str;
			boolean sw;
			while(room > 0){
				str = String.valueOf(i);
				sw = true;
				for(int j = 0;j < str.length();j++){
					if(str.charAt(j) == '4' || str.charAt(j) == '6'){
						sw = false;
						break;
					}
				}
				if(sw){
					room--;
					//System.out.println(i);
				}
				i++;
			}
			System.out.println(i-1);
		}
	}
}