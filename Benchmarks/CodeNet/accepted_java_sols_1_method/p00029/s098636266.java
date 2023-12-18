import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] str = scan.nextLine().split(" ");
			int length = str[0].length();
			int tarlenI = 0;
			int tarcouI = 0;
			for(int i = 1;i < str.length;i++){
				if(length < str[i].length()){
					tarlenI = i;
					length = str[i].length();
				}
			}
			int mcount  = 0;
			for(int i = 0;i < str.length-1;i++){
				int count = 0;
				for(int j = i + 1;j < str.length;j++){
					if(str[i].equals(str[j])){
						count++;
					}
				}
				if(mcount < count){
					mcount = count;
					tarcouI = i;
				}
			}
			System.out.println(str[tarcouI] + " " + str[tarlenI]);
		}
	}
}