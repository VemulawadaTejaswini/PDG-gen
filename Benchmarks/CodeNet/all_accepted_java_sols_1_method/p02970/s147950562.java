import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        for(int i=1;;i++){
            if(n<=(2*d+1)*i){
                System.out.println(i);
                break;
            }
        }
    }
}