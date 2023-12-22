import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                for(int i=1;i<10001;i++){
                        String val=scan.nextLine();
                        if(val.equals("0 0")){
                                System.exit(0);
                        }
                        String [] num=val.split(" ",0);
                        int x=Integer.parseInt(num[0]);
                        int y=Integer.parseInt(num[1]);
                        if(x<y){
                                System.out.println(x+" "+y);
                        }else{
                                System.out.println(y+" "+x);
                        }
                }
        }
}