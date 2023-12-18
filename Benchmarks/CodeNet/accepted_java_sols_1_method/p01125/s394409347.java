import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int[][] field = new int[21][21];
			
			int robotPositionYoko=10;
			int robotPositionTate=10;

			int jueleNumber = scan.nextInt();
			int juelePositionYoko;
			int juelePositionTate;
			if (jueleNumber == 0)
				break;

			for (int i = 0; i < jueleNumber; i++) {
				juelePositionYoko = scan.nextInt();
				juelePositionTate = scan.nextInt();
				field[juelePositionYoko][juelePositionTate] = 1;
			}

			int order = scan.nextInt();
			char direction;
			int dirNumber;
			for (int i = 0; i < order; i++) {
				direction = scan.next().charAt(0);
				dirNumber = scan.nextInt();
				switch (direction) {
				case 'N':
					for(int j=0;j<dirNumber;j++){
						robotPositionTate++;
						if(field[robotPositionYoko][robotPositionTate]==1)field[robotPositionYoko][robotPositionTate]=0;
					}
					break;
				case 'E':
					for(int j=0;j<dirNumber;j++){
						robotPositionYoko++;
						if(field[robotPositionYoko][robotPositionTate]==1)field[robotPositionYoko][robotPositionTate]=0;
					}
					break;
				case 'S':
					for(int j=0;j<dirNumber;j++){
						robotPositionTate--;
						if(field[robotPositionYoko][robotPositionTate]==1)field[robotPositionYoko][robotPositionTate]=0;
					}
					break;
				case 'W':
					for(int j=0;j<dirNumber;j++){
						robotPositionYoko--;
						if(field[robotPositionYoko][robotPositionTate]==1)field[robotPositionYoko][robotPositionTate]=0;
					}
					break;
				}
				
			}
			int flag=0;
			for(int i=0;i<21;i++){
				for(int j=0;j<21;j++){
					if(field[i][j]==1)flag=1;
				}
			}
			if(flag==0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
		}
	}
}