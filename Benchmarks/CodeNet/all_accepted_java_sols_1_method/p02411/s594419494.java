import java.util.Scanner;

public class Main{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum;
                
        while(true){
            int m=sc.nextInt();
            int f=sc.nextInt();
            int r=sc.nextInt();
            if(m==-1&&f==-1&&r==-1){
                break;
            }

            sum = m+f;

            if(m==-1 || f==-1){
                System.out.printf("F");
            }else if(sum<30){
                System.out.printf("F");
            }else if(sum<50){
                if(r<50){
                    System.out.printf("D");
                }else{
                    System.out.printf("C");
                }
            }else if(sum<65){
                System.out.printf("C");
            }else if(sum<80){
                System.out.printf("B");
            }else{
                System.out.printf("A");
            }
            System.out.printf("\n");
        }
    }
}
