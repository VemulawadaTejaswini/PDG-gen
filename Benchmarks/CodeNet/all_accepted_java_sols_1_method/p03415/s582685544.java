import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	char[][] C =new char[3][3];
	String[] S=new String[3];
	for(int i=0;i<3;i++){
	    S[i]=stdIn.next();
	}
	System.out.print(S[0].charAt(0));
	System.out.print(S[1].charAt(1));
	System.out.print(S[2].charAt(2));
	System.out.println();
    }
}
