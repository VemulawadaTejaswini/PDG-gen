import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int k=0; k<50; k++){
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        if(m == -1 && f == -1 && r == -1){
            break;
        }
        int d = m + f;
        if(m == -1 || f ==-1){
            System.out.println("F");
        }else if(d>=80){
            System.out.println("A");
        }else if(d>=65){
            System.out.println("B");
        }else if(d>=50){
            System.out.println("C");
        }else if(d>=30){
            if(r>=50){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }else{
            System.out.println("F");
        }

        
    }
}
}
