import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    String[][] b;
    String s;

    void run(){
	while(sc.hasNext()){
	    s = sc.next();
	    b = new String[3][3];
	    for(int i=0; i<3; i++)
		for(int k=0; k<3; k++)
		    b[i][k] = s.substring(i*3+k, i*3+k+1);
	    //show();
	    System.out.println(check());
	}
    }

    String check(){
	// 横
	for(int i=0; i<3; i++)
	    if(b[i][0].equals(b[i][1]) && b[i][0].equals(b[i][2]))
		if(b[i][0].equals("o")) return "o";
		else if(b[i][0].equals("x")) return "x";
	// 縦
	for(int i=0; i<3; i++)
	    if(b[0][i].equals(b[1][i]) && b[0][i].equals(b[2][i]))
		if(b[0][i].equals("o")) return "o";
		else if(b[0][i].equals("x")) return "x";
	// 斜め
	if((b[0][0].equals(b[1][1]) && b[0][0].equals(b[2][2])) ||
	   (b[0][2].equals(b[1][1]) && b[0][2].equals(b[2][0])))
	    if(b[0][0].equals("o")) return "o";
	    else if(b[0][0].equals("x")) return "x";
	
	return "d";
    } 

    void show(){
	for(int i=0; i<3; i++){
	    for(int k=0; k<3; k++)
		System.out.print(b[i][k]+" ");
	    System.out.println();
	}
    }
}