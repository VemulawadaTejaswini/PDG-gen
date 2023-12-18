import java.util.Scanner;
public class Main {
	
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int a=scan.nextInt();
    	int b=scan.nextInt();
    	String snuke[][]=new String[a][b];
    	int x=0;
    	int y=0;
    	for(int i=0;i!=a;i++) {
    		for(int j=0;j!=b;j++) {
    			snuke[i][j]=scan.next();
    			if(snuke[i][j].equals("snuke")) {
    				x=i+1;
    				y=j+1;
    			}
    		}
    	}
    	String ans="";
    	switch(y) {
    	case 1:ans="A";break;
    	case 2:ans="B";break;
    	case 3:ans="C";break;
    	case 4:ans="D";break;
    	case 5:ans="E";break;
    	case 6:ans="F";break;
    	case 7:ans="G";break;
    	case 8:ans="H";break;
    	case 9:ans="I";break;
    	case 10:ans="J";break;
    	case 11:ans="K";break;
    	case 12:ans="L";break;
    	case 13:ans="M";break;
    	case 14:ans="N";break;
    	case 15:ans="O";break;
    	case 16:ans="P";break;
    	case 17:ans="Q";break;
    	case 18:ans="R";break;
    	case 19:ans="S";break;
    	case 20:ans="T";break;
    	case 21:ans="U";break;
    	case 22:ans="V";break;
    	case 23:ans="W";break;
    	case 24:ans="X";break;
    	case 25:ans="Y";break;
    	case 26:ans="Z";break;
    	}
    	System.out.println(ans+""+x);
    }
}