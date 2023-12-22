import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int c[] = new int[9];
        for(int i=0;i<9;++i)c[i]=scan.nextInt();
        for(int i=0;i<2;++i){
            int d=c[i*3] - c[(i+1)*3];
            for(int j=0;j<3;++j){
                if(c[i*3+j]-c[(i+1)*3+j]!=d){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}