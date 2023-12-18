
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  t[]=new int[5];
        t[0] = scan.nextInt();
        t[1] = scan.nextInt();
        t[2] = scan.nextInt();
        t[3] = scan.nextInt();
        t[4] = scan.nextInt();
        
            for(int i = 0; i<4;i++){
                for(int j =0;j<4-i;j++){
                    if(t[j]<t[j+1]){
                        int temp =  t[j];
                        t[j] = t[j+1];
                        t[j+1]=temp;
                        
                    }
                }
        }
            System.out.println(t[0]+" "+t[1]+" "+t[2]+" "+t[3]+" "+t[4]);
    }
}


