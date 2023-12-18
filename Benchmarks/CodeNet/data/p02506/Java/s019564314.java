import java.util.Scanner;

class Main{

    public static void main(String[] args){
	String data,word;
	int count = 0;
	int i = 1;

	Scanner scan = new Scanner(System.in);

	word = scan.next();
	word = word.toUpperCase();

	while(i == 1){
	    data = scan.next();
	    data = data.toUpperCase();
	    if(data.equals("END_OF_TEXT")){
		break;
	    }
	    if(word.equals(data)){
		count += 1;
	    }

	}
	System.out.println(count);
	count = 0;
    }
}