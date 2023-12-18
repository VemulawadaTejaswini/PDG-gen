import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			for(int k = 0;k < n;k++){
				String str = scan.next();
				String train = str.charAt(0) + "";
				int now = 0;
				for(int i = 1;i < str.length();i+=3){
					if(str.charAt(i) == '-'){
						if(now == train.length()-1){
							train += str.charAt(i+2);
						}
						now++;
					}else if(str.charAt(i) == '<'){
						if(now == 0){
							train = str.charAt(i+2) + train;
						}else{
							now--;
						}
					}
				}
				System.out.println(train);
			}
		}
	}
}