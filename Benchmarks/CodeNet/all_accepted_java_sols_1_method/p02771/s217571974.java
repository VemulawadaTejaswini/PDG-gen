import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int[] n = new int[3];
        for (int i=0;i<3;i++){
            n[i] = yomi.nextInt();
        }
        if (n[0]==n[1]){
            if (n[2]==n[1]){
                System.out.println("No");
            }else System.out.println("Yes");
        }else if (n[0]==n[2]){
            if (n[2]==n[1]){
                System.out.println("No");
            }else System.out.println("Yes");
        }else if (n[1]==n[2]){
            System.out.println("Yes");
        }else System.out.println("No");
        }
    }