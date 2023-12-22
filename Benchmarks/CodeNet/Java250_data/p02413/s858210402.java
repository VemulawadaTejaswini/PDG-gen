import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Row=sc.nextInt();
        int Col=sc.nextInt();
        int table[][] =new int[Row+1][Col+1];
        for(int i=0;i<Row;i++){
            for(int j=0;j<Col;j++){
                table[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i < Row; i++){
			for(int j = 0; j < Col; j++){
				table[i][Col] += table[i][j];
			}
		}

		for(int i = 0; i <= Col; i++){
			for(int j = 0; j < Row; j++){
				table[Row][i] += table[j][i];
			}
		}

		for(int i = 0; i <= Row; i++){
			System.out.printf("%d", table[i][0]);
			for(int j = 1; j <= Col; j++){
				System.out.printf(" %d", table[i][j]);
			}
			System.out.printf("\n");
		}
    }
}
