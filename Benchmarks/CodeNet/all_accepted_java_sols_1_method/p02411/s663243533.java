import java.util.Scanner;                                                                        
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            int m = in.nextInt();
            int f = in.nextInt();
            int r = in.nextInt();
            int g = m+f;
        if(m == -1 && f == -1 && r == -1){
            break;
        }
        if(m == -1 | f == -1){
            System.out.println("F");
        }else if(g >= 80 ){
            System.out.println("A");
        }else if(g >= 65 && g <= 79){
            System.out.println("B");
        }else if(g >= 50 && g <= 64){
            System.out.println("C");
        }else if(g >= 30 && g <= 49){
            if(r >= 50){
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