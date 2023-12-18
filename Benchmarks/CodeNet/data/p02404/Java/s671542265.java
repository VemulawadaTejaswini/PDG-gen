import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;

       while(true){

            String num1 = br.readLine();
            String[] num2 = num1.split(" ");
            int H = Integer.parseInt(num2[0]);
            int W = Integer.parseInt(num2[1]);

            if(H == 0 && W == 0){
                break;
            }

            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    if(i == 0 || i == H-1){
                        System.out.print("#");
                    }else if(j == 0 || j == W-1){
                        System.out.print("#");
                    }else {
                        System.out.print(".");
                    }
                }
                    System.out.println("");
            }
            System.out.println("");
        }
    }
}