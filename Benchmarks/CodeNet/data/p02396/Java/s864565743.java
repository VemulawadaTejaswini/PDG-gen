import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = null;
        int i=0;
        for(int j=1; j<10000; j++){
            sc = new Scanner(System.in);
            i = sc.nextInt();
            if(i==0) {
                sc.close();
                return;
            }
            System.out.println("Case "+j+": "+i);
        }
        sc.close();
    }
}