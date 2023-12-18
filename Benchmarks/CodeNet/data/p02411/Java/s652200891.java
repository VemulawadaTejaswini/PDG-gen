import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i;
        int[] test = new int[3];
        
        int x;
        int y;
        while (true) {
            for (i = 0; i < 3; i++) {
                test[i] = sc.nextInt();
            }
            if(test[0] == -1 && test[1] == -1 && test[2] == -1) break;
            if(test[0] == -1 || test[1] == -1){
                System.out.println("F");
            }else if(test[0]+test[1] >= 80){
                System.out.println("A");
            }else if(test[0]+test[1] >= 65 && test[0]+test[1] < 80){
                System.out.println("B");
            }else if(test[0]+test[1] >= 50 && test[0]+test[1] <65){
                System.out.println("C");
            }else if(test[0]+test[1] >= 30 && test[0]+test[1] <50 && test[2] >=50){
                System.out.println("C");
            }else if(test[0]+test[1] >= 30 && test[0]+test[1] <50){
                System.out.println("D");                
            }else{
                System.out.println("F");
            }              
        }
        sc.close();
    }
}
