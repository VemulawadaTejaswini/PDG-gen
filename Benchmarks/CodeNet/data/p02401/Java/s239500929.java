import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        
        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            
            String str[] = br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[2]);
            
            if(str[1].equals("+")){
                System.out.println(a + b);
            }else if(str[1].equals("-")){
                System.out.println(a - b);
            }else if(str[1].equals("*")){
                System.out.println(a * b);
            }else if(str[1].equals("/")){
                System.out.println(a / b);
            }else if(str[1].equals("?")){
                break;
            }
        }
    }
}