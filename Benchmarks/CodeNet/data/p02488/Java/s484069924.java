import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	String word[];
	String temp;
	int i;

	    int N = sc.nextInt();
	    word = new String[N];

	    for(i = 0; i < N; i++){
		word[i] = sc.next();
	    }

	    for(i = N - 1; i > 0; i--){
		if(word[i - 1].compareTo(word[i]) > 0){
		    temp = word[i].trim();
		    word[i] = word[i - 1].trim();
		    word[i - 1] = temp.trim();
		}
	    }
	    System.out.printf("%s", word[0]);
    }
}