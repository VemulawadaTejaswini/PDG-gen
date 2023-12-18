import java.util.Scanner;

public class Main{

 public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
     
        int[][] arrCards = new int[4][13];
        
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            String a = scan.next();
            int ranks = scan.nextInt();
            if (a.equals("S")) {
                arrCards[0][ranks - 1] = 1;
            }else if(a.equals("H")){
                arrCards[1][ranks-1] = 1;
            }else if(a.equals("C")){
                arrCards[2][ranks-1] = 1;
            }else{
                arrCards[3][ranks-1] = 1;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (arrCards[i][j] == 0) {
                    if (i==0) {
                        System.out.println("S " + (j+1));
                    }else if(i == 1){
                        System.out.println("H " + (j+1));
                    }else if(i==2){
                        System.out.println("C " + (j+1));
                    }else if(i==3){
                        System.out.println("D " + (j+1));
                    }
                }
            }
        }
       
    }
}
