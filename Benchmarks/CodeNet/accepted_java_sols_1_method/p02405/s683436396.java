import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        while(H!=0||W!=0){
            for(int j=1;j<=H;j++){
                if(j%2!=0) {
                    for(int i=1;i<=W;i++){
                        if(i%2==0) System.out.print(".");
                        else       System.out.print("#");
                    }
                }else{ 
                    for(int i=1;i<=W;i++){
                        if(i%2==0) System.out.print("#");
                        else       System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
            H = sc.nextInt();
            W = sc.nextInt();
        }
    }
}
