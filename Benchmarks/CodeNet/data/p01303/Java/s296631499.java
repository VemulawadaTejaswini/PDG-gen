import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int data = scan.nextInt();
			for(int Case = 0;Case < data;Case++){
				int x = scan.nextInt();
				int y = scan.nextInt();
				int w = scan.nextInt();
				int h = scan.nextInt();
				int cat = scan.nextInt();
				int count = 0;
				int cx;
				int cy;
				for(int i = 0;i < cat;i++){
					cx = scan.nextInt();
					cy = scan.nextInt();
					if(x <= cx && x+w >= cx && y <= cy && y+h >= cy){
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}