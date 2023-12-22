import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        
        while(true){
            int m=scn.nextInt();
            int f=scn.nextInt();
            int r=scn.nextInt();
            
            if(m==-1 && f==-1 && r==-1){
                break;
            } else {
                transcript(m,f,r);
            }
        }
    }

    private static void transcript(int m, int f, int r) {
        int sum=m+f;
        if(m==-1 || f==-1){
            System.out.println("F");
        }else if(sum >= 80){
            System.out.println("A");
        }else if(sum>=65 && sum<80){
            System.out.println("B");
        }else if(sum>=50 && sum<65){
            System.out.println("C");
        }else if(sum>=30 && sum<50){
            if(r>=50){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }else if(sum>=0 && sum<30){
            System.out.println("F");
        }
    }
}