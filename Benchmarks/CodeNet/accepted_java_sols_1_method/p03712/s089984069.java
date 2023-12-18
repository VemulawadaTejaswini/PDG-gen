import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        String[] a = new String[h];
        for(int i = 0;i<h;i++){
            a[i] = sc.nextLine();
        }
        for(int i = 0;i<h+2;i++){
            if(i == 0 || i == h+1){
                for(int j = 0;j<w+1;j++){
                    System.out.print("#");
                    if(j==w){
                        System.out.println("#");
                    }
                }
            }else{
                System.out.print("#");
                System.out.print(a[i-1]);
                System.out.println("#");
            }
        }
    }
}