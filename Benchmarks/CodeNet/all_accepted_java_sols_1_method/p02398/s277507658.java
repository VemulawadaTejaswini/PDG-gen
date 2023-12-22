import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        for(int i = a; i <= b; i++){
            if(c % i == 0){
                count++ ;
            }else{
                continue;
            }
        }
        
        System.out.println(count);
    }
}
