import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	String str;

	while(sc.hasNext()){
	    char[] ch = (sc.nextLine()).toCharArray();

	    for(int i = 0; i < ch.length; i++)
		if(check(ch[i])){
		    str = String.valueOf(ch[i++]);
		    for(; i < ch.length && check(ch[i]); i++)
			str += String.valueOf(ch[i]);

		    sum += Integer.parseInt(str);
		}
	}

	System.out.println(Integer.toString(sum));
    }

    boolean check(char c){
	return ('0' <= c && c <= '9');
    }

    public static void main(String[] args){
	new Main();
    }
}