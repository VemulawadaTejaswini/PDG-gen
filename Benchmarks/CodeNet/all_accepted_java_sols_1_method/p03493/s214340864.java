import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] c = n.toCharArray();
        int x = 0;
        for(int i=0; i<3; i++){
            if(c[i] == '1'){
                x++;
            }
        }
        System.out.println(x);
    }
}