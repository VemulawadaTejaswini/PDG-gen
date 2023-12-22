import java.util.*;
class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int m=sc.nextInt();
                int[][] cards = new int[4][13];
                Arrays.fill(cards[0],0);
                for(int j=0;j<m;j++){
                        String str = sc.next();
                        int n = sc.nextInt();
                        if(str.equals("S")){
                                cards[0][n-1]=1;
                        }else if(str.equals("H")){
                                cards[1][n-1]=1;
                        }else if(str.equals("C")){
                                cards[2][n-1]=1;
                        }else if(str.equals("D")){
                                cards[3][n-1]=1;
                        }
                }
                for(int i=0;i<4;i++){
                        for(int j=1;j<=13;j++){
                                if(cards[i][j-1]==0){
                                        switch(i){
                                        case 0:
                                        System.out.println("S " + j);
                                        break;
                                        case 1:
                                        System.out.println("H " + j);
                                        break;
                                        case 2:
                                        System.out.println("C " + j);
                                        break;
                                        case 3:
                                        System.out.println("D " + j);
                                        break;
                                        }
                                }
                        }
                }
        }
}