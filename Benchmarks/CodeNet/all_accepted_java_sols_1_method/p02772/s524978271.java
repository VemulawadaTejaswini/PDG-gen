
import java.util.Scanner;

/**
 * @author : gaurav.ss
 * @since : 16/02/20
 **/
 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        boolean flag=true;
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            if(x%2==0){
                if(x%3!=0 && x%5!=0){
                    flag=false;

                }
            }
        }
        if(flag)
            System.out.println("APPROVED");
        else
            System.out.println("DENIED");
    }
}
