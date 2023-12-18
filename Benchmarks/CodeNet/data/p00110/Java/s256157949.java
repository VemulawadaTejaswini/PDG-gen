import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine().replace("+"," ").replace("="," ");
			boolean sw = true;
			for(int i = 9;i >= 0;i--){
				String[] a = str.replaceAll("X",String.valueOf(i)).split(" ");
				if(i == 0){
					for(int j = 0;j < 3;j++){
						if(a[j].length() > 1 && a[j].charAt(0) == '0'){
							sw = false;
							break;
						}
					}
					if(!sw){
						sw = true;
						continue;
					}
				}
				if(Double.parseDouble(a[2])-Double.parseDouble(a[1])==Double.parseDouble(a[0])){
					sw = false;
					System.out.println(i);
					break;
				}
			}
			if(sw){
				System.out.println("NA");
			}
		}
	}
}