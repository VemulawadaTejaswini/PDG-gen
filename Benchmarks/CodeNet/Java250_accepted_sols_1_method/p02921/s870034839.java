import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n=0;
        for(int i =0;i<3;i++){
            if((a.substring(i,i+1)).equals(b.substring(i,i+1)))
                n++;
        }
        System.out.println(n);
    }
}