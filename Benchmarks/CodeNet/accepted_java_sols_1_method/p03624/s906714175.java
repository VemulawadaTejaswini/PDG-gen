import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String S = scan.next();

	int[] alpha = new int[26];
	for(int i = 0; i < S.length(); i++){
	    alpha[S.charAt(i)-97]++;
	}

	int moji = 97;
	int flag = 0;
	for(int i = 0; i < 26; i++){
	    if(alpha[i] == 0){
		flag = 1;
		break;
	    }else{
		moji++;
	    }
	}

	if(flag == 1){
	    System.out.println((char)moji);
	}else{
	    System.out.println("None");
	}
    }
}
