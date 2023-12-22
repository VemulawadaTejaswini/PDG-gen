import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;

        while(true){

            String num1 = br.readLine();
            String[] num2 = num1.split(" ");
            int a = Integer.parseInt(num2[0]);
            int b = Integer.parseInt(num2[2]);
            String op = num2[1];

            if(op.equals("+")){
                num = a + b;
                System.out.println(num);
            }else if(op.equals("-")){
                num = a - b;
                System.out.println(num);
            }else if(op.equals("*")){
                num = a * b;
                System.out.println(num);
            }else if(op.equals("/")){
                num = a / b;
                System.out.println(num);
            }else if(op.equals("?")){
                break;
            }
        }
    }
}