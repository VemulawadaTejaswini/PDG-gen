import java.util.Scanner;

public class Main{
    String word[][] = {
	{},
	{".", ",", "!", "?", " "},
	{"a", "b", "c"},
	{"d", "e", "f"},
	{"g", "h", "i"},
	{"j", "k", "l"},
	{"m", "n", "o"},
	{"p", "q", "r", "s"},
	{"t", "u", "v"},
	{"w", "x", "y", "z"}
    };

    Main(){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int k = 0; k < n; k++){
	    String str = sc.next();
	    int m = str.length();
	    String st = "";
	    for(int i = 0; i < m; i++){
		String s = str.substring(i, i+1);
		int p = Integer.parseInt(s);
		int q, c = 0;
		if(p == 0){
		    continue;
		} else if(p == 1){
		    q = 5;
		} else if(p == 7 || p == 9){
		    q = 4;
		} else {
		    q = 3;
		}
		i++;
		while(s.equals(str.substring(i, i+1)) && i < m){
		    i++;
		    c++;
		}
		st += word[p][c%q];
	    }
	    System.out.println(st);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}