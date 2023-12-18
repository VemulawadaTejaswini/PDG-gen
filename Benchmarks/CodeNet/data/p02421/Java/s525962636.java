import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String t;
        String h;
        int t_point = 0;
        int h_point = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n ;i++){
            t = sc.next();
            h = sc.next();
            if(t.compareTo(h) > 0){
                t_point += 3;
            }
            else if(t.compareTo(h) < 0){
                h_point += 3;
            }
            else{
                t_point += 1;
                h_point += 1;
            }
        }
        System.out.println(t_point + " " + h_point);
    }
}
