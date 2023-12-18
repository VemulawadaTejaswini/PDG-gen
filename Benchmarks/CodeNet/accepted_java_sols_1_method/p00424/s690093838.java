import java.util.Scanner;


class Main{
    public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	char[][] table = new char[62*61][2];


	while(true){
	    int n = scn.nextInt();

	    if(n==0) break;

	    for(int i=0; i<n; i++){
		table[i][0] = scn.next().charAt(0);
		table[i][1] = scn.next().charAt(0);
	    }

	    int m = scn.nextInt();

	    loop: for(int i=0; i<m; i++){
		char ch = scn.next().charAt(0);
		for(int j=0; j<n; j++)
		    if(ch == table[j][0]){
			System.out.print(table[j][1]);
			continue loop;
		    }
		System.out.print(ch);
	    }
	    System.out.println();
	}
    }
}