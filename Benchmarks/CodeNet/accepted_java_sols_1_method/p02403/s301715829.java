import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] h=new int[2000];
        int[] w=new int[2000];
        int i=0;
        while(true){
            h[i]=scan.nextInt();
            w[i]=scan.nextInt();
            if(h[i]==0&&w[i]==0){
                break;
            }
            for(int j=0;j<h[i];j++){
                for(int k=0;k<w[i];k++){
                    System.out.printf("#");
                }
                System.out.println();
            }
            System.out.println();
            i++;
        }
    }
}
