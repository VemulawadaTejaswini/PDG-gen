import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int x = 0, y = 0;
        int it = 0;
        boolean res = true;
        for(int i=0; i<n; i++){
            int t = scan.nextInt();
            int tx = scan.nextInt();
            int ty = scan.nextInt();
            if(!res) continue;
            for(int j=it; j<t; j++){
                if(Math.abs(tx-x) > Math.abs(ty-y)){
                    if((tx-x) > 0) x++;
                    else x--;
                }else{
                    if((ty-y) > 0) y++;
                    else y--;
                }
            }
            it = t;
            if(x == tx && y == ty) res = true;
            else res =false;
        }

        if(res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
        
    }

}