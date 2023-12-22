import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] l = new int[m];
        int[] r = new int[m];
        for(int i = 0; i < m; i++){
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
        
        int maxL = 1;
        int minR = n;
        for(int i = 0; i < m; i++){
            if(l[i] > maxL){
                maxL = l[i];
            }
            if(r[i] < minR){
                minR = r[i];
            }
        }
        
        if((minR - maxL) < 0){
            System.out.println(0);
        }else{
            System.out.println(minR - maxL +1);
        }
    }
}