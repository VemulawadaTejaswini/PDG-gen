import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ca=0,cb=0,co=0,cab=0;
        while(sc.hasNext()){
            String str[]=sc.next().split(",");
            if(str[1].equals("A")){
                ca++;
            }
            if(str[1].equals("B")){
                cb++;
            }
            if(str[1].equals("O")){
                co++;
            }
            if(str[1].equals("AB")){
                cab++;
            }
        }
        System.out.printf("%d\n%d\n%d\n%d\n",ca,cb,cab,co);
    }
 
}