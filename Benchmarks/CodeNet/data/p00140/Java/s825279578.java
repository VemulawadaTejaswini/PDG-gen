import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			for(int i = 0;i < n;i++){
				int start = scan.nextInt();
				int end = scan.nextInt();
				String ans = "";
				if(start == end){
					System.out.println(start);
					continue;
				}
				if(start < end){
					for(int j = start;j < end;j++){
						ans += String.valueOf(j) + " ";
					}
					ans += end;
				}else if(start <= 5 && end <= 5){
					for(int j = start;j > end;j--){
						ans += String.valueOf(j) + " ";
					}
					ans += end;
				}else if(start > 5 && end > 5){
					for(int j = start;j < 10;j++){
						ans += String.valueOf(j) + " ";
					}
					for(int j = 5;j < end;j++){
						ans += String.valueOf(j) + " ";
					}
					ans += end;
				}else{
					for(int j = start;j < 10;j++){
						ans += String.valueOf(j) + " ";
					}
					for(int j = 5;j > end;j--){
						ans += String.valueOf(j) + " ";
					}
					ans += end;
				}
				System.out.println(ans);
			}
		}
	}
}