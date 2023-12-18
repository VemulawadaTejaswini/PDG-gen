import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	int[] hist;
	int four;
	int three;
	int two;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			hist = new int[14];
			String[] str = scan.next().split(",");
			for(int i = 0;i < 5;i++){
				hist[Integer.parseInt(str[i])]++;
			}
			four = 0;
			three = 0;
			two = 0;
			for(int i = 1;i < 14;i++){
				switch(hist[i]){
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				default:
					break;
				}
			}
			if(four > 0){
				System.out.println("four card");
			}else if(three > 0 && two > 0){
				System.out.println("full house");
			}else if(three > 0){
				System.out.println("three card");
			}else if(two > 1){
				System.out.println("two pair");
			}else if(two > 0){
				System.out.println("one pair");
			}else{
				if(hist[1] > 0 && hist[10] > 0 && hist[11] > 0 && hist[12] > 0 && hist[13] > 0){
					System.out.println("straight");
				}else{
					boolean fl = true;
					for(int i = 1;i < 10;i++){
						if(hist[i] > 0 && hist[i+1] > 0 && hist[i+2] > 0 && hist[i+3] > 0 && hist[i+4] > 0){
							fl = false;
							break;
						}
					}
					System.out.println((fl)?"null":"straight");
				}
			}
		}
	}
}