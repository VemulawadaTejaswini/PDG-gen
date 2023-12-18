import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strarr = str.split(" ");
        
        int num1 = Integer.parseInt(strarr[0]);
        int num2 = Integer.parseInt(strarr[1]);
        
        if(num1 < num2) {
            System.out.println("a < b");
        } else if(num1 > num2) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
    
}
