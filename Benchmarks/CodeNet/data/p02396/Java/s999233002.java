import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                for(int i=1;i<10001;i++){
                        String val=scan.nextLine();
                        if(val.equals("0")){
                                System.exit(0);
                        }
                        System.out.println("Case "+i+": "+val);
                }
        }
}