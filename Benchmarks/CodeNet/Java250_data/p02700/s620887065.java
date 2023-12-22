import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int Thp = scan.nextInt();
        int Tattack = scan.nextInt();
        int Ahp = scan.nextInt();
        int Aattack = scan.nextInt();
        while(true){
            if((Ahp - Tattack) > 0){
                Ahp = Ahp - Tattack;
             }else{
                 System.out.println("Yes");
                 break;     
             }
             if((Thp - Aattack) > 0){
                 Thp = Thp - Aattack;
             }else{
                 System.out.println("No");
                 break;
             }
                    }
    }
}