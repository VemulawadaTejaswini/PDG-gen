import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	char[] stack = new char[300000];
	int stCount;
	int k;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.equals("JOI")){
				System.out.println(1);
				continue;
			}
			stCount = 0;
			k = 0;
			for(int i = 0;i < str.length();i++){
				char t = str.charAt(i);
				if(t == 'J'){
					if(stCount == 0 || stack[stCount-1] == 'J'){
					}else if(stack[stCount-1] == 'O'){
						stCount = 0;
						stack[stCount] = ' ';
					}else if(stack[stCount-1] == 'I'){
						k = countI();
					}
					stack[stCount++] = 'J';
				}else if(t == 'O'){
					if(stCount > 0){
						if(stack[stCount-1] == 'J'){
							stack[--stCount] = 'O';
						}else if(stack[stCount-1] == 'I'){
							k = countI();
						}else{
							stCount = 0;
							stack[stCount] = ' ';
						}
					}else{
						stCount = 0;
						stack[stCount] = ' ';
					}
				}else if(t == 'I'){
					if(stack[stCount] == 'O'){
						stack[stCount++] = 'I';
					}else if(stCount > 0 && stack[stCount-1] == 'I'){
						k = countI();
					}else{
						stCount = 0;
						stack[stCount] = ' ';
					}
				}
				if(i == str.length()-1 && t == 'I'){
					k = countI();
				}
			}
			System.out.println(k);
		}
	}
	public int countI(){
		int tk = 0;
		stCount--;
		while(stCount > -1 && stack[stCount] == 'I'){
			stCount--;
			tk++;
		}
		stCount = 0;
		return (k < tk)?tk:k;
	}
}