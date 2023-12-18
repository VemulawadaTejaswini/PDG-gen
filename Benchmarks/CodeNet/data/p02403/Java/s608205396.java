import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int [] h, w;
        h = new int[300];
        w = new int[300];

        while(true){
            h[cnt] = sc.nextInt();
            w[cnt] = sc.nextInt();
            if(h[cnt] == 0 || w[cnt] == 0)
                break;
            cnt++;
        }

        for(int i=0; i<cnt; i++){
            for(int j=0; j<h[i]; j++){
                for(int k=0; k<w[i]; k++){
                    System.out.print("#");
                }
                System.out.print("\n");                
            }
            System.out.println("");
        }
    sc.close();
    }
}
