import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean OK=true;
        for(int i=1;i<=n;i++){
            if(i%3==0) System.out.print(" " + i);
            else{
                int x = i;
                while(OK){
                    if(x%10==3){
                        System.out.print(" " + i);
                        OK = false;
                    }
                    x /= 10;
                    if(x==0) OK = false;
                }
                OK = true;
            }
        }
        System.out.println();
    }
}
