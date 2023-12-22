import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = 0, h = 0;
        
        int x = sc.nextInt();
        
        for(int i = 0; i < x; i++){
            String str1 = sc.next();
            String str2 = sc.next();
            if(str1.compareTo(str2)<0){
                h+=3;
            }else if(str1.compareTo(str2)==0){
                t++;
                h++;
            }else{
                t+=3;
            }
        }
        System.out.println(t + " " + h);
    }
}
