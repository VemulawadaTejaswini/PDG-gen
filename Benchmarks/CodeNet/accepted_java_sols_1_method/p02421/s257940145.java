import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int ap=0,bp=0;
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            String a=scan.next();
            String b=scan.next();

            if(a.compareTo(b)>0){
                ap+=3;
            }else if(a.compareTo(b)==0){
                ap++;
                bp++;
            }else{
                bp+=3;
            }
        }
        System.out.println(ap+" "+bp);
    }
}

