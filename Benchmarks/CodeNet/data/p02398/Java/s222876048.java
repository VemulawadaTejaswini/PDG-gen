import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int t = 0;
        
        for(int i = 0; i < b-a+1; i++){
            if(c%(a+i) == 0)
            t++;
        }
        System.out.println(t);
    }
}
