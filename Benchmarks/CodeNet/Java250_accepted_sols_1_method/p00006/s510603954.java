import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc= new Scanner(System.in);

	while(sc.hasNext()){
	    String str = sc.next();
	    char[] ch = str.toCharArray();

	    for(int i = str.length()-1; i >= 0; i--)
		System.out.print(Character.toString(ch[i]));
	    System.out.println();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}