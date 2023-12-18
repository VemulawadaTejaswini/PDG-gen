import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			String str = scan.next();
			String nstr;
			for(int i = 0;i < n;i++){
				nstr = "";
				int count = 1;
				for(int j = 1;j < str.length();j++){
					if(str.charAt(j) != str.charAt(j-1)){
						nstr += String.valueOf(count) + str.charAt(j-1);
						count = 1;
					}else{
						count++;
					}
					if(j == str.length()-1){
						nstr += String.valueOf(count) + str.charAt(j);
					}
				}
				str = nstr;
			}
			System.out.println(str);
		}
	}
}