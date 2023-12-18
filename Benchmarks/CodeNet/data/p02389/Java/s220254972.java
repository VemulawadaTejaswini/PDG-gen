import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int i,j,area,per;
        
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        j = scan.nextInt();
        
        area = i*j;
        per = (i*2)+(j*2);
        System.out.println(area + " " + per);
        
        
    }
}
