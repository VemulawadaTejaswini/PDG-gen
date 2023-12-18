import java.util.Scanner;

public class Main{
    String[][] btn = {
	{},
	{".", ",", "!", "?", " "},
	{"a", "b", "c"},
	{"d", "e", "f"},
	{"g", "h", "i"},
	{"j", "k", "l"},
	{"m", "n", "o"},
	{"p", "q", "r", "s"},
	{"t", "u", "v"},
	{"w", "x", "y", "z"},
    };

    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    for(int t = 0; t < n; t++){
		char[] ch = (sc.next()).toCharArray();
		String res = "";

		for(int i = 0; i < ch.length;){
		    int cnt = 0;
		    char p = ch[i++];
		    while(i < ch.length && ch[i] == p){
			cnt++; i++;
		    }

		    if(p != '0'){
			int q = (int)(p-'0');
			res += btn[q][cnt%btn[q].length];
		    }
		}

		System.out.println(res);
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}