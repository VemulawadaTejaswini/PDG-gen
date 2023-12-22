import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] h, w;
        h = new int[100];
        w = new int[100];
        int cnt=0;

        while(true){
            h[cnt] = sc.nextInt();
            w[cnt] = sc.nextInt();
            if(h[cnt]==0 && w[cnt]==0)
                break;
            cnt++;
        }
        for(int k=0; k<cnt; k++){
            for(int i=0; i<h[k]; i++){
                for(int j=0; j<w[k]; j++){
                    if(i%2 == 0){
                        if(j%2==0)
                            System.out.print("#");
                        else   
                            System.out.print(".");
                    }else{
                        if(j%2==1)
                            System.out.print("#");
                        else   
                            System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
        sc.close();
    }
}

