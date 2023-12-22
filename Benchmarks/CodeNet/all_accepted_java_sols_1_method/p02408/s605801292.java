import java.util.*;
// スペードが'S'、ハートが'H'、クラブが'C'、ダイヤが'D'で表されています。整数はそのカードのランク(1 〜 13)
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] data = new int[4][13];
        
        for(int i=0;i<n;i++){
            String[] s = sc.nextLine().split(" ");
            int num = Integer.parseInt(s[1])-1;
            switch (s[0]) {
                case "S":
                    data[0][num]=1;
                    break;
                case "H":
                    data[1][num]=1;
                    break;
                case "C":
                    data[2][num]=1;
                    break;
                case "D":
                    data[3][num]=1;
                    break;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                if(data[i][j]==0) {
                    switch (i) {
                        case 0:
                            System.out.println("S "+(j+1));
                            break;
                        case 1:
                            System.out.println("H "+(j+1));
                            break;
                        case 2:
                            System.out.println("C "+(j+1));
                            break;
                        case 3:
                            System.out.println("D "+(j+1));
                            break;
                    }
                    
                }
            }
        }
        
    }
}
