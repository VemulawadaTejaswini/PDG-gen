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
			for(int i = 0;i < n;i++){
				char[] ch = str.toCharArray();
				str = "";
				int count = 1;
				for(int j = 1;j < ch.length;j++){
					if(ch[j] != ch[j-1]){
						str += String.valueOf(count) + ch[j-1];
						count = 1;
					}else{
						count++;
					}
					if(j == ch.length-1){
						str += String.valueOf(count) + ch[j];
					}
				}
			}
			System.out.println(str);
		}
	}
}