import java.util.Scanner;
class Main{
    public static void main(String[] argd){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int k = scan.nextInt();

        int ar[] = {a,b,c,d,e};

        String flag = "Yay!";

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(Math.abs(ar[i] - ar[j]) > k){
                    flag = ":(";
                }
            }
        }

        System.out.println(flag);

    }
}