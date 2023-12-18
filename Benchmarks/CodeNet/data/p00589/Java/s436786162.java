import java.util.Scanner;

class Main{

    char[][] buttons = {{},
		       {'.', ',', '!', '?', ' '},
		       {'a', 'b', 'c'},
		       {'d', 'e', 'f'},
		       {'g', 'h', 'i'},
		       {'j', 'k', 'l'},
		       {'m', 'n', 'o'},
		       {'p', 'q', 'r', 's'},
		       {'t', 'u', 'v'},
		       {'w', 'x', 'y', 'z'}};

    Main(){
	Scanner sc = new Scanner(System.in);
	String line = sc.next();
	String message = getMessage(line);
	System.out.println(message);
    }

    String getMessage(String line){
        // your code

	char word, moji;
	int count = 0, num = 0, i, l;
	String message = "";

        for(i=0;i < line.length();i++){
	    count = 0;
	    word = line.charAt(i);
	    if(word == '1') num = 1;
	    else if(word == '2') num = 2;
	    else if(word == '3') num = 3;
	    else if(word == '4') num = 4;
	    else if(word == '5') num = 5;
	    else if(word == '6') num = 6;
	    else if(word == '7') num = 7;
	    else if(word == '8') num = 8;
	    else if(word == '9') num = 9;
	    else num = 0;
	    i++;
	    while(true){
		moji = line.charAt(i);
		if(moji == '0') break;
		count++;
		i++;
	    }
	    l = 0;
	    if(num == 1) l = count % 5;
	    else if(num == 2 || num == 3 || num == 4 ||
		    num == 5 || num == 6 || num == 8) l = count % 3;
	    else if(num == 7 || num == 9) l = count % 4;
	    message += buttons[num][l];
	}

	return message;
    }

    public static void main(String[] args){
	new Main();
    }
}