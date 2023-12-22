import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int k = scn.nextInt();
        int x = scn.nextInt();
        int answer = x-k;
        scn.close();
        for(int i=0;i<2*(k-1)+1;i++){
            System.out.println(++answer);
        }
    }
}
