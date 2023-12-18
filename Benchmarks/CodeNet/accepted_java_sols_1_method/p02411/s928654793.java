import java.util.Scanner;


public class Main{
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        int m[] = new int[50];
        int f[] = new int[50];
        int r[] = new int[50];
        int i=0;
        while(true){
            m[i] = sc.nextInt();
            f[i] = sc.nextInt();
            r[i] = sc.nextInt();
            if(m[i]==-1 && f[i]==-1 &&r[i]==-1){
                break;
            }
            if(m[i]==-1 || f[i]==-1){
                System.out.printf("F\n");
        }else if(m[i]+f[i]>=80){
            System.out.printf("A\n");
        }else if(m[i]+f[i]<80 && 65<= m[i]+f[i]){
            System.out.printf("B\n");
        }else if(m[i]+f[i]>=50 && m[i]+f[i]<65){
            System.out.printf("C\n");
        }else if(m[i]+f[i]>=30 && m[i]+f[i]<50){
            if(r[i]>=50){
                System.out.printf("C\n");
            }else{
            System.out.printf("D\n");
            }
        }else if(m[i]+f[i]<30){
            System.out.printf("F\n");
        }
        
            
            i++;
            
        }
        sc.close();
    }
}
