import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	int J;
	int O;
	int I;
	int max;
	char t;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.indexOf("J") < 0 || str.indexOf("O") < 0 || str.indexOf("I") < 0){
				System.out.println(0);
				continue;
			}
			J = 0;
			O = 0;
			I = 0;
			max = 0;
			for(int i = 0;i < str.length();i++){
				t = str.charAt(i);
				if(t == 'J'){
					if(I > 0){
						max = Math.max(max,(O > I)?0:Math.min(I,Math.min(O,J)));
						J = 0;
						O = 0;
						I = 0;
					}else if(O > 0){
						J = 0;
						O = 0;
					}
					J++;
				}else if(t == 'O'){
					if(I > 0){
						max = Math.max(max,(O > I)?0:Math.min(I,Math.min(O,J)));
						J = 0;
						O = 0;
						I = 0;
					}else if(J > 0){
						O++;
						if(J < O){
							J = 0;
							O = 0;
						}
					}
				}else if(t == 'I'){
					if(J > 0 && O > 0){
						I++;
					}else{
						J = 0;
						O = 0;
						I = 0;
					}
				}
			}
			if(I > 0){
				max = Math.max(max,(O > I)?0:Math.min(I,Math.min(O,J)));
			}
			System.out.println(max);
		}
	}
}