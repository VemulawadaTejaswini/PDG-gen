import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i;
        Scanner sc= new Scanner(System.in);

        while(true){
            String sarr=sc.next();

            if(sarr.equals("-")){
                break;
            }

            int m=sc.nextInt();
            int sum=0;
            for(i=0;i<m;i++){
                int h=sc.nextInt();
                sum+=h;
            }
            
            for(i=0;i<sarr.length();i++){
                int last = (i+sum) % sarr.length();
                System.out.printf("%c",sarr.charAt(last));
            }
            System.out.println();
        }
        sc.close();
    }    
}
