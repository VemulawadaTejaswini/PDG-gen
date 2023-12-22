import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int Y = scan.nextInt();

        int x = 0; //10000円
        int y = 0; //5000円
        int z = Y/1000; //1000円

        for(int i=0; i<N*10; i++){
            if(x+y+z > N){
                if(y>=2){
                    y = y - 2;
                    x++;
                }else if(z>=5) {
                    z = z - 5;
                    y++;
                }
            }else if(x+y+z < N){
                if(x>0){
                    x--;
                    y = y + 2;
                }else if(y>4){
                    y--;
                    z = z + 5;
                }
            }else{
                break;
            }
        }
        if(x+y+z == N) {
            System.out.println(x + " " + y + " " + z);
        }else{
            System.out.println(-1 + " " + -1 + " " +  -1);
        }
    }
}
