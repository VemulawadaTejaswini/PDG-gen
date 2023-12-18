import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] str = (sc.nextLine()).split(" ");
	    String res = "";
	    for(int i = 0; i < str.length; i++){
		char[] ch = str[i].toCharArray();
		boolean f1, f2;
		f1 = f2 = false;
		for(int j = 0; j < ch.length; j++){
		    if('0' <= ch[j] && '9' >= ch[j]){
			f1 = true;
		    } else {
			f2 = true;
		    }
		}
		if(f1 && f2){
		    res += "_HYBRID";
		} else if(f1){
		    res += "_DIGIT";
		} else {
		    res += "_WORD";
		}
	    }

	    System.out.println(res);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}