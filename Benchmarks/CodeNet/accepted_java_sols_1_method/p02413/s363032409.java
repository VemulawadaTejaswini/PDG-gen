import java.util.*;
/*
(r+1) × (c+1) の新しい表を出力して下さい。各行の隣り合う整数は１つの空白で区切って
下さい。各行の最後の列としてその行の合計値を、各列の最後の行としてその列の合計値を、
最後の行・列に表全体の合計値を挿入して下さい。 
*/
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
       int r = sc.nextInt();//　n行ある
       int c = sc.nextInt();//　m行ある

        int [][] answer = new int[100+1][100+1];//元の表入れる箱
//        int [] row = new int [c];//answer行合計入れる箱
//        int [] column = new int [r];//answer列合計入れる箱

        int rowtotal=0;//行小計
        int columntotal=0;//列小計
        int totalall=0;//合計

        int i;
        int j;
        int k;
        int l;

        for( i = 0; i < r; i++){
          for( j = 0; j < c; j++){
              answer[i][j] = sc.nextInt();
  
              totalall += answer[i][j];
              rowtotal += answer[i][j];
              
              System.out.print(answer[i][j] + " ");
 //             }else{
 //                 System.out.print(answer[i][j]);
 //             }
              }
 //         }
               answer[i][c] = rowtotal;
               System.out.println(answer[i][c]);
               rowtotal = 0;

        }
        answer[r][c]=totalall;

        for(i=0;i<c;i++){
            for(j = 0;j<r;j++){
                columntotal+=answer[j][i];
                
            }
            answer[r][i]=columntotal;
            System.out.print(answer[r][i] + " ");
            
            columntotal=0;
        }
        System.out.println(answer[r][c]);
    }
}


