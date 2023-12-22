import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int[] b = new int[4];
        for(int i=0; i<4; i++) {
            b[i] = Integer.parseInt(a.substring(i, i+1));
        }
        if(b[0]+b[1]+b[2]+b[3]==7) {
            System.out.println(b[0]+"+"+b[1]+"+"+b[2]+"+"+b[3]+"=7");
        }else if(b[0]+b[1]+b[2]-b[3]==7) {
            System.out.println(b[0]+"+"+b[1]+"+"+b[2]+"-"+b[3]+"=7");
        }else if(b[0]+b[1]-b[2]+b[3]==7) {
            System.out.println(b[0]+"+"+b[1]+"-"+b[2]+"+"+b[3]+"=7");
        }else if(b[0]+b[1]-b[2]-b[3]==7) {
            System.out.println(b[0]+"+"+b[1]+"-"+b[2]+"-"+b[3]+"=7");
        }else if(b[0]-b[1]+b[2]+b[3]==7) {
            System.out.println(b[0]+"-"+b[1]+"+"+b[2]+"+"+b[3]+"=7");
        }else if(b[0]-b[1]+b[2]-b[3]==7) {
            System.out.println(b[0]+"-"+b[1]+"+"+b[2]+"-"+b[3]+"=7");
        }else if(b[0]-b[1]-b[2]+b[3]==7) {
            System.out.println(b[0]+"-"+b[1]+"-"+b[2]+"+"+b[3]+"=7");
        }else if(b[0]-b[1]-b[2]-b[3]==7) {
            System.out.println(b[0]+"-"+b[1]+"-"+b[2]+"-"+b[3]+"=7");
        }
    }
}