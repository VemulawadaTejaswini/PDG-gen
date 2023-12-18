import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	String s = scan.next();

	//初期のドットの数
	int firstDot = 0;
	for(int i = 0; i < n; i++){
	    if(s.charAt(i) == '.'){
		firstDot++;
	    }
	}

	int min = firstDot;
	int tmp = firstDot;
	//基準を設定
	//基準より左は .
	//基準より右は #
	for(int i = 0; i < n; i++){
	    //変える必要がない .
	    if(s.charAt(i) == '.'){
		tmp--;
		//変える必要がある#
	    }else{
		tmp++;
	    }
	    if(min > tmp){
		min = tmp;
	    }
	}

	System.out.println(min);
    }
}
