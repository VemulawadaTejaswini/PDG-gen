import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	int [][][]kanri =new int[5][4][11];
	int tou,kai,heya,nin,x;
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	for(x=1;x<=n;x++){
		tou=sc.nextInt();kai=sc.nextInt();
		heya=sc.nextInt();nin=sc.nextInt();
		kanri[tou][kai][heya]=kanri[tou][kai][heya]+nin;
	}
	for(tou=1;tou<=4;tou++){
		for(kai=1;kai<=3;kai++){
			for(heya=1;heya<=10;heya++){System.out.print(" "+kanri[tou][kai][heya]);}
			if(tou!=4&&kai==3){System.out.print("\n"+"####################");}
			System.out.print("\n");
		}
	}
	}
}