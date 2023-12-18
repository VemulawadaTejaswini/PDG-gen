import java.util.Scanner;

public class Main{
        public static void main(final String[] args){
            final Scanner sc = new Scanner(System.in);
            while(true){
                int mid = sc.nextInt();
                int fin = sc.nextInt();
                int re = sc.nextInt();
                if(mid + fin  + re == -3){
                    break;
                }
                if(mid == -1 || fin == -1){
                    System.out.println("F");
                }else if(mid + fin >= 80){
                    System.out.println("A");
                }else if(mid + fin >= 65){
                    System.out.println("B");
                }else if(mid + fin >= 50){
                    System.out.println("C");
                }else if(re >= 50){
                    System.out.println("C");
                }else if(mid + fin >= 30){
                    System.out.println("D");
                }else{
                    System.out.println("F");
                }
            }
            sc.close();
        }
         

}
