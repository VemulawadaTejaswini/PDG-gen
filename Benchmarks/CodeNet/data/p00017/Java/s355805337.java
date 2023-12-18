import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		char alf[] = new char[26]; 
		int num = 0;
		for(char i = 'a';i < 'z';i++){
			alf[num] = i;
			num++;
		}
		num = -1;
		String str[] = sc.nextLine().split(" ");
		for(int i = 0;i < str.length;i++){
			char ctr[] = str[i].toCharArray();
			if(ctr.length == 3){
				for(int j = 0;j < 26;j++){
					if(ctr[0] == alf[(j + 19) % 26] && ctr[1] == alf[(j + 7) % 26] && ctr[2] == alf[(j + 4) % 26]){
						num = j; 
					}
				}
			}else if(ctr.length == 4){
				for(int j = 0;j < 26;j++){
					if(ctr[0] == alf[(j + 19) % 26] && ctr[1] == alf[(j + 7) % 26] && ctr[2] == alf[(j + 8) % 26] && ctr[3] == alf[(j + 18) % 26]){
						num = j; 
					}else if(ctr[0] == alf[(j + 19) % 26] && ctr[1] == alf[(j + 7) % 26] && ctr[2] == alf[j] && ctr[3] == alf[(j + 19) % 26]){
						num = j; 
					}
				}
			}
			if(num != -1)break;
		}
		for(int i = 0;i < str.length;i++){
			char ctr[] = str[i].toCharArray();
			if(i != str.length - 1){
				for(int j = 0;j < ctr.length;j++){
					for(int k = 0;k < 26;k++){
						if(ctr[j] == '.'){
							System.out.print('.');
							break;
						}
						if(ctr[j] == alf[k]){
							System.out.print(alf[(k - num + 26) % 26]);
							break;
						}
					}
				}
				System.out.print(" ");
			}else{
				for(int j = 0;j < ctr.length;j++){
					for(int k = 0;k < 26;k++){
						if(ctr[j] == '.'){
							System.out.print('.');
							break;
						}
						if(ctr[j] == alf[k]){
							System.out.print(alf[(k - num + 26) % 26]);
							break;
						}
					}				
				}
				System.out.println();
			}
		}
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}