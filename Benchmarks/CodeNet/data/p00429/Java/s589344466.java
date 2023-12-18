import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);

		while(true){
			int count = stdIn.nextInt();
			String mojiretu = stdIn.next();
			String temp = "";
			if(count > 20 || mojiretu.length() > 100){
				break;
			}
			for(int i =0;i<count;i++){
				int cnt = 0;
				char chk;
				for(int j=0;j<mojiretu.length();j++){
					chk = mojiretu.charAt(j);
					if(chk == mojiretu.charAt(j)){
						cnt++;
					}
					if((j+1) >= mojiretu.length()){
						temp = temp.concat(Integer.toString(cnt));
						cnt = 0;
						temp = temp.concat(Character.toString(chk));
						break;
					}
					if(chk != mojiretu.charAt(j+1)){
						temp = temp.concat(Integer.toString(cnt));
						cnt = 0;
						temp = temp.concat(Character.toString(chk));
					}
				}
				mojiretu = temp;
				temp = "";
			}
			System.out.println(mojiretu);
		}
	}
}