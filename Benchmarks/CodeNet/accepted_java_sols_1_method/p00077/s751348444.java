import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    char[] ch = (sc.next()).toCharArray();
	    String str = "";

	    for(int i = 0; i < ch.length; i++){
		if(ch[i] == '@'){
		    int n = Integer.parseInt(""+ch[++i]);
		    i++;
		    for(int j = 0; j < n; j++)
			str += String.valueOf(ch[i]);
		} else {
		    str += String.valueOf(ch[i]);
		}
	    }

	    System.out.println(str);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}